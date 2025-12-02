// BankManager.java
package com.bank.system;

import java.sql.SQLException;
import java.util.List;

public class BankManager {

    private AccountDAO accountDAO = new AccountDAO();

    public Account getAccount(long accNum) {
        return accountDAO.getAccountByNumber(accNum);
    }

    public void performDeposit(long accountNumber, double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Deposit amount must be positive.");
        }
        accountDAO.updateBalanceAndLogTransaction(accountNumber, amount, "Deposit");
    }

    public void performWithdrawal(long accountNumber, double amount) throws Exception {
        Account account = accountDAO.getAccountByNumber(accountNumber);

        if (account == null) {
            throw new Exception("Account not found.");
        }

        if (account.getBalance() < amount) {
            throw new Exception("InsufficientFundsException: Withdrawal amount exceeds current balance.");
        }

        accountDAO.updateBalanceAndLogTransaction(accountNumber, -amount, "Withdrawal");
    }

    public void transfer(long sourceAcc, long destAcc, double amount) throws Exception {
        if (sourceAcc == destAcc) {
            throw new Exception("Cannot transfer funds to the same account.");
        }
        if (amount <= 0) {
            throw new Exception("Transfer amount must be positive.");
        }

        Account sourceAccount = accountDAO.getAccountByNumber(sourceAcc);

        if (sourceAccount == null) {
            throw new Exception("Source account not found.");
        }

        if (sourceAccount.getBalance() < amount) {
            throw new Exception("InsufficientFundsException: Cannot transfer due to low balance.");
        }

        accountDAO.transferFunds(sourceAcc, destAcc, amount);
    }

    public List<Transaction> getTransactionHistory(long accNum) {
        return accountDAO.getTransactionHistory(accNum);
    }
}