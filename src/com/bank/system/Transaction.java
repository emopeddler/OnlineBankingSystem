// Transaction.java
package com.bank.system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private long transactionId;
    private long accountNumber;
    private String type;
    private double amount;
    private LocalDateTime transactionDate;

    public Transaction(long transactionId, long accountNumber, String type, double amount, LocalDateTime transactionDate) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public long getTransactionId() { return transactionId; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public LocalDateTime getTransactionDate() { return transactionDate; }

    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return transactionDate.format(formatter);
    }
}