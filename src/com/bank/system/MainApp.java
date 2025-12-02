package com.bank.system;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== Starting Banking System ===");

        // Open the login window
        SwingUtilities.invokeLater(() -> {
            System.out.println("Opening login window...");
            SimpleLoginFrame login = new SimpleLoginFrame();
            login.setVisible(true);
        });
    }
}