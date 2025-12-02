// ConsoleUI.java
package com.bank.system;

import java.util.List;

public class ConsoleUI {

    public static void printAccountSummary(long accNumber, String accType, double balance) {
        System.out.println("\n--- A C C O U N T   S U M M A R Y ----------------");
        System.out.printf("  %-25s: %d\n", "Account Number", accNumber);
        System.out.printf("  %-25s: %s\n", "Account Type", accType);
        System.out.println("--------------------------------------------------");
        System.out.printf("  %-25s: $%.2f\n", "Current Balance", balance);
        System.out.println("--------------------------------------------------\n");
    }

    public static void printTransactionHistory(List<Transaction> transactions) {
        if (transactions.isEmpty()) {
            System.out.println("  No recent transactions found.");
            return;
        }

        System.out.println("\n--- R E C E N T   T R A N S A C T I O N S ----------");
        System.out.printf("  %-12s | %-10s | %s\n", "Type", "Amount", "Date/Time");
        System.out.println("  --------------------------------------------------");

        for (Transaction tx : transactions) {
            String sign = tx.getType().contains("Out") || tx.getType().contains("Withdrawal") ? "-" : "+";

            System.out.printf("  %-12s | %s%-9.2f | %s\n",
                    tx.getType(),
                    sign + "$",
                    tx.getAmount(),
                    tx.getFormattedDate()
            );
        }
        System.out.println("--------------------------------------------------\n");
    }
}