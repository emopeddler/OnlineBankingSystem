// AccountDAO.java
package com.bank.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    // AUTHENTICATION (Login)
    public Customer authenticateUser(String username, String password) {
        String sql = "SELECT customer_id, first_name, last_name, username, password_hash, phone FROM Customer WHERE username = ? AND password_hash = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Customer(
                            rs.getInt("customer_id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("username"),
                            rs.getString("password_hash"),
                            rs.getString("phone")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Database error during authentication: " + e.getMessage());
        }
        return null;
    }

    // 1. Fetches an Account (used by Manager to check balance)
    public Account getAccountByNumber(long accountNumber) {
        String sql = "SELECT account_number, customer_id, account_type, balance FROM Account WHERE account_number = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, accountNumber);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new SavingsAccount(
                            rs.getLong("account_number"),
                            rs.getDouble("balance"),
                            rs.getInt("customer_id")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching account: " + e.getMessage());
        }
        return null;
    }

    // 2. Used by Deposit/Withdrawal (updates balance and logs transaction)
    public void updateBalanceAndLogTransaction(long accountNumber, double amount, String type) throws SQLException {
        Connection conn = null;
        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false); // CRITICAL: Start the transaction

            String updateSql = "UPDATE Account SET balance = balance + ? WHERE account_number = ?";
            try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                updateStmt.setDouble(1, amount);
                updateStmt.setLong(2, accountNumber);
                updateStmt.executeUpdate();
            }

            logTransaction(conn, accountNumber, type, amount);

            conn.commit();

        } catch (SQLException e) {
            if (conn != null) {
                conn.rollback();
            }
            throw e;
        } finally {
            if (conn != null) {
                conn.setAutoCommit(true);
                conn.close();
            }
        }
    }

    // 3. SECURE FUND TRANSFER (The shining feature - fully transactional)
    public void transferFunds(long sourceAccNumber, long destinationAccNumber, double amount) throws Exception {
        Connection conn = null;
        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false); // Start the atomic transaction

            String debitSql = "UPDATE Account SET balance = balance - ? WHERE account_number = ?";
            try (PreparedStatement debitStmt = conn.prepareStatement(debitSql)) {
                debitStmt.setDouble(1, amount);
                debitStmt.setLong(2, sourceAccNumber);
                debitStmt.executeUpdate();
            }

            String creditSql = "UPDATE Account SET balance = balance + ? WHERE account_number = ?";
            try (PreparedStatement creditStmt = conn.prepareStatement(creditSql)) {
                creditStmt.setDouble(1, amount);
                creditStmt.setLong(2, destinationAccNumber);
                creditStmt.executeUpdate();
            }

            logTransaction(conn, sourceAccNumber, "Transfer (Out)", -amount);
            logTransaction(conn, destinationAccNumber, "Transfer (In)", amount);

            conn.commit();

        } catch (SQLException e) {
            if (conn != null) {
                conn.rollback();
            }
            throw new Exception("Database error during transfer: " + e.getMessage());
        } finally {
            if (conn != null) {
                conn.setAutoCommit(true);
                conn.close();
            }
        }
    }

    // 4. Get Transaction History
    public List<Transaction> getTransactionHistory(long accNum) {
        List<Transaction> history = new ArrayList<>();
        String sql = "SELECT transaction_id, type, amount, transaction_date FROM Transaction WHERE account_number = ? ORDER BY transaction_date DESC LIMIT 10";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, accNum);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    history.add(new Transaction(
                            rs.getLong("transaction_id"),
                            accNum,
                            rs.getString("type"),
                            rs.getDouble("amount"),
                            rs.getTimestamp("transaction_date").toLocalDateTime()
                    ));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching transaction history: " + e.getMessage());
        }
        return history;
    }

    // Helper method to log a single transaction
    private void logTransaction(Connection conn, long accNum, String type, double amount) throws SQLException {
        String logSql = "INSERT INTO Transaction (account_number, type, amount) VALUES (?, ?, ?)";
        try (PreparedStatement logStmt = conn.prepareStatement(logSql)) {
            logStmt.setLong(1, accNum);
            logStmt.setString(2, type);
            logStmt.setDouble(3, Math.abs(amount));
            logStmt.executeUpdate();
        }
    }
}