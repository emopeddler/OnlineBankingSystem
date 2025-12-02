// SavingsAccount.java
package com.bank.system;

public class SavingsAccount extends Account {

    public SavingsAccount(long accountNumber, double balance, int customerId) {
        super(accountNumber, balance, customerId, "Savings");
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            double newBalance = getBalance() + amount;
            setBalance(newBalance);
        }
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (getBalance() < amount) {
            throw new Exception("InsufficientFundsException: Withdrawal amount exceeds current balance.");
        }
        if (amount > 0) {
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
        }
    }
}