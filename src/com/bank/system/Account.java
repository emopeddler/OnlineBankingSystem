// Account.java
package com.bank.system;

public abstract class Account {

    private long accountNumber;
    private double balance;
    private int customerId;
    private String accountType;

    public Account(long accountNumber, double balance, int customerId, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerId = customerId;
        this.accountType = accountType;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount) throws Exception;

    public long getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public int getCustomerId() { return customerId; }
    public String getAccountType() { return accountType; }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}