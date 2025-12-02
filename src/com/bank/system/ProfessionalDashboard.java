package com.bank.system;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ProfessionalDashboard extends JFrame {
    private JLabel balanceLabel, welcomeLabel, dateLabel;
    private JTextArea transactionArea, notificationArea;
    private double currentBalance = 5420.75;

    public ProfessionalDashboard(String username) {
        setTitle("Bank Dashboard - " + username);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);

        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBackground(new Color(245, 247, 250));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // ========== TOP PANEL ==========
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.WHITE);
        topPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                BorderFactory.createEmptyBorder(15, 20, 15, 20)
        ));

        // Left side - Welcome
        JPanel welcomePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        welcomePanel.setBackground(Color.WHITE);
        welcomeLabel = new JLabel("Welcome, " + username);
        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        welcomeLabel.setForeground(new Color(30, 30, 30));
        welcomePanel.add(welcomeLabel);

        // Right side - Balance and Date
        JPanel rightPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        rightPanel.setBackground(Color.WHITE);

        // Date
        dateLabel = new JLabel(new SimpleDateFormat("EEEE, MMMM dd, yyyy").format(new Date()));
        dateLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        dateLabel.setForeground(Color.GRAY);
        dateLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        // Balance
        balanceLabel = new JLabel("Current Balance: $" + formatBalance(currentBalance));
        balanceLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        balanceLabel.setForeground(new Color(0, 150, 0));
        balanceLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        rightPanel.add(dateLabel);
        rightPanel.add(balanceLabel);

        topPanel.add(welcomePanel, BorderLayout.WEST);
        topPanel.add(rightPanel, BorderLayout.EAST);

        // ========== CENTER PANEL ==========
        JPanel centerPanel = new JPanel(new GridLayout(1, 3, 15, 0));
        centerPanel.setBackground(new Color(245, 247, 250));

        // LEFT COLUMN: Account Operations
        JPanel operationsPanel = createOperationsPanel();

        // MIDDLE COLUMN: Recent Transactions
        JPanel transactionsPanel = createTransactionsPanel();

        // RIGHT COLUMN: Notifications & Quick Actions
        JPanel notificationsPanel = createNotificationsPanel();

        centerPanel.add(operationsPanel);
        centerPanel.add(transactionsPanel);
        centerPanel.add(notificationsPanel);

        // ========== BOTTOM PANEL ==========
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(200, 200, 200)),
                BorderFactory.createEmptyBorder(15, 20, 15, 20)
        ));

        // Quick Stats
        JPanel statsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 0));
        statsPanel.setBackground(Color.WHITE);

        statsPanel.add(createStatBox("Total Transactions", "47"));
        statsPanel.add(createStatBox("This Month", "$1,250.50"));
        statsPanel.add(createStatBox("Last Login", "Today, 09:30 AM"));
        statsPanel.add(createStatBox("Account Status", "Active"));

        // Logout Button
        JButton logoutBtn = new JButton("Logout");
        logoutBtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        logoutBtn.setBackground(new Color(108, 117, 125));
        logoutBtn.setForeground(Color.WHITE);
        logoutBtn.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
        logoutBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to logout?",
                    "Confirm Logout",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                this.dispose();
                new SimpleLoginFrame().setVisible(true);
            }
        });

        bottomPanel.add(statsPanel, BorderLayout.WEST);
        bottomPanel.add(logoutBtn, BorderLayout.EAST);

        // Add all panels to main panel
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private JPanel createOperationsPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(220, 220, 220)),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));

        // Title
        JLabel title = new JLabel("Account Operations");
        title.setFont(new Font("Segoe UI", Font.BOLD, 16));
        title.setForeground(new Color(0, 100, 200));
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Operation buttons
        String[] operations = {
                "Deposit Funds",
                "Withdraw Cash",
                "Transfer Money",
                "View Statement",
                "Account Details",
                "Card Services",
                "Branch Locator",
                "Contact Support"
        };

        Color[] colors = {
                new Color(40, 167, 69),    // Green
                new Color(220, 53, 69),    // Red
                new Color(255, 193, 7),    // Yellow
                new Color(0, 123, 255),    // Blue
                new Color(111, 66, 193),   // Purple
                new Color(253, 126, 20),   // Orange
                new Color(32, 201, 151),   // Teal
                new Color(108, 117, 125)   // Gray
        };

        for (int i = 0; i < operations.length; i++) {
            JButton btn = createOperationButton(operations[i], colors[i]);
            btn.setAlignmentX(Component.LEFT_ALIGNMENT);
            btn.setMaximumSize(new Dimension(280, 45));
            panel.add(btn);
            if (i < operations.length - 1) {
                panel.add(Box.createRigidArea(new Dimension(0, 10)));
            }
        }

        panel.add(Box.createVerticalGlue());
        return panel;
    }

    private JButton createOperationButton(String text, Color color) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setBackground(color.darker());
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setBackground(color);
            }
        });

        // Add action based on button text
        if (text.contains("Deposit")) {
            btn.addActionListener(e -> showDepositDialog());
        } else if (text.contains("Withdraw")) {
            btn.addActionListener(e -> showWithdrawDialog());
        } else if (text.contains("Transfer")) {
            btn.addActionListener(e -> showTransferDialog());
        } else if (text.contains("Statement")) {
            btn.addActionListener(e -> showStatementDialog());
        } else if (text.contains("Details")) {
            btn.addActionListener(e -> showAccountDetailsDialog());
        } else {
            btn.addActionListener(e -> JOptionPane.showMessageDialog(this,
                    text + " feature coming soon!",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE));
        }

        return btn;
    }

    private JPanel createTransactionsPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(220, 220, 220)),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));

        // Title
        JLabel title = new JLabel("Recent Transactions");
        title.setFont(new Font("Segoe UI", Font.BOLD, 16));
        title.setForeground(new Color(0, 100, 200));
        title.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));

        // Transaction area
        transactionArea = new JTextArea();
        transactionArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        transactionArea.setEditable(false);
        transactionArea.setBackground(new Color(248, 249, 250));

        // Sample transactions
        String[] transactions = {
                "Jan 15, 2024 09:30 AM   +$500.00   Deposit              Completed",
                "Jan 14, 2024 02:15 PM   -$120.00   Withdrawal          Completed",
                "Jan 13, 2024 11:45 AM   -$45.50    Starbucks Purchase  Completed",
                "Jan 12, 2024 04:30 PM   +$750.00   Salary Credit       Completed",
                "Jan 11, 2024 10:20 AM   -$89.99    Amazon Purchase     Completed",
                "Jan 10, 2024 01:45 PM   -$35.00    Grocery Store       Completed",
                "Jan 09, 2024 08:15 AM   +$300.00   Transfer Received   Completed",
                "Jan 08, 2024 12:30 PM   -$25.00    Netflix SubscriptionCompleted",
                "Jan 07, 2024 03:45 PM   +$200.00   Gift Received       Completed",
                "Jan 06, 2024 10:00 AM   -$15.50    Coffee Shop         Completed"
        };

        StringBuilder sb = new StringBuilder();
        for (String t : transactions) {
            sb.append(t).append("\n");
        }
        transactionArea.setText(sb.toString());

        JScrollPane scrollPane = new JScrollPane(transactionArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(220, 220, 220)));

        // View All button
        JButton viewAllBtn = new JButton("View All Transactions");
        viewAllBtn.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        viewAllBtn.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        viewAllBtn.addActionListener(e -> showAllTransactions());

        panel.add(title, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(viewAllBtn, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createNotificationsPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(220, 220, 220)),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));

        // Title
        JLabel title = new JLabel("Notifications & Alerts");
        title.setFont(new Font("Segoe UI", Font.BOLD, 16));
        title.setForeground(new Color(0, 100, 200));
        title.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));

        // Notifications area
        notificationArea = new JTextArea();
        notificationArea.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        notificationArea.setEditable(false);
        notificationArea.setBackground(new Color(255, 253, 231));

        String[] notifications = {
                "Security Alert: New login detected from your device",
                "Transaction Successful: Deposit of $500 completed",
                "Mobile Banking: Update your app for new features",
                "Card Activity: Your card was used at Starbucks",
                "Reminder: Loan payment due in 3 days",
                "Offer: Get 5% cashback on grocery purchases",
                "Security: Enable 2-factor authentication",
                "Monthly Statement: January statement is ready"
        };

        StringBuilder sb = new StringBuilder();
        for (String n : notifications) {
            sb.append("• ").append(n).append("\n\n");
        }
        notificationArea.setText(sb.toString());

        JScrollPane scrollPane = new JScrollPane(notificationArea);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(255, 230, 150)));

        // Quick Actions
        JPanel quickActionsPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        quickActionsPanel.setBorder(BorderFactory.createTitledBorder("Quick Actions"));
        quickActionsPanel.setBackground(Color.WHITE);

        String[] quickActions = {"Mobile Banking", "Block Card", "Email Statement", "Print Receipt"};
        for (String action : quickActions) {
            JButton btn = new JButton(action);
            btn.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            btn.setBackground(new Color(240, 240, 240));
            btn.addActionListener(e -> JOptionPane.showMessageDialog(this,
                    action + " clicked!", "Quick Action", JOptionPane.INFORMATION_MESSAGE));
            quickActionsPanel.add(btn);
        }

        panel.add(title, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(quickActionsPanel, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createStatBox(String title, String value) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        titleLabel.setForeground(Color.GRAY);

        JLabel valueLabel = new JLabel(value);
        valueLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        valueLabel.setForeground(new Color(30, 30, 30));

        panel.add(titleLabel);
        panel.add(valueLabel);

        return panel;
    }

    // ========== DIALOG METHODS ==========

    private void showDepositDialog() {
        JTextField amountField = new JTextField(10);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Amount: $"));
        panel.add(amountField);

        int result = JOptionPane.showConfirmDialog(this, panel,
                "Deposit Funds", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                currentBalance += amount;
                balanceLabel.setText("Current Balance: $" + formatBalance(currentBalance));

                // Add to transactions
                transactionArea.append(new SimpleDateFormat("MMM dd, yyyy hh:mm a").format(new Date()) +
                        "   +$" + formatBalance(amount) + "   Deposit              Completed\n");

                JOptionPane.showMessageDialog(this,
                        "Successfully deposited $" + formatBalance(amount) + "\nNew Balance: $" + formatBalance(currentBalance),
                        "Deposit Successful", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid amount", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void showWithdrawDialog() {
        JTextField amountField = new JTextField(10);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Amount: $"));
        panel.add(amountField);

        int result = JOptionPane.showConfirmDialog(this, panel,
                "Withdraw Cash", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                if (amount > currentBalance) {
                    JOptionPane.showMessageDialog(this, "Insufficient funds", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    currentBalance -= amount;
                    balanceLabel.setText("Current Balance: $" + formatBalance(currentBalance));

                    // Add to transactions
                    transactionArea.append(new SimpleDateFormat("MMM dd, yyyy hh:mm a").format(new Date()) +
                            "   -$" + formatBalance(amount) + "   Withdrawal          Completed\n");

                    JOptionPane.showMessageDialog(this,
                            "Successfully withdrew $" + formatBalance(amount) + "\nNew Balance: $" + formatBalance(currentBalance),
                            "Withdrawal Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid amount", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void showTransferDialog() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.add(new JLabel("To Account:"));
        JTextField accountField = new JTextField(15);
        panel.add(accountField);

        panel.add(new JLabel("Amount: $"));
        JTextField amountField = new JTextField(10);
        panel.add(amountField);

        panel.add(new JLabel("Description:"));
        JTextField descField = new JTextField(15);
        panel.add(descField);

        int result = JOptionPane.showConfirmDialog(this, panel,
                "Transfer Money", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            try {
                double amount = Double.parseDouble(amountField.getText());
                if (amount > currentBalance) {
                    JOptionPane.showMessageDialog(this, "Insufficient funds", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    currentBalance -= amount;
                    balanceLabel.setText("Current Balance: $" + formatBalance(currentBalance));

                    // Add to transactions
                    transactionArea.append(new SimpleDateFormat("MMM dd, yyyy hh:mm a").format(new Date()) +
                            "   -$" + formatBalance(amount) + "   Transfer to " + accountField.getText() + " Completed\n");

                    JOptionPane.showMessageDialog(this,
                            "Transfer successful!\nTo: " + accountField.getText() +
                                    "\nAmount: $" + formatBalance(amount) +
                                    "\nNew Balance: $" + formatBalance(currentBalance),
                            "Transfer Complete", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid amount", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // === UPDATED: Statement Dialog with PDF Export ===
    private void showStatementDialog() {
        JTextArea statementArea = new JTextArea(20, 50);
        statementArea.setFont(new Font("Monospaced", Font.PLAIN, 11));
        statementArea.setEditable(false);

        // Generate statement
        String statement = "===============================================\n" +
                "          BANK STATEMENT - JANUARY 2024\n" +
                "===============================================\n" +
                "Account Holder: Test User\n" +
                "Account Number: ****1234\n" +
                "Statement Period: Jan 1 - Jan 31, 2024\n" +
                "===============================================\n" +
                "DATE         DESCRIPTION           AMOUNT   BALANCE\n" +
                "-----------------------------------------------\n" +
                "Jan 01       Opening Balance      $5,000.00\n" +
                "Jan 06       Coffee Shop          -$15.50   $4,984.50\n" +
                "Jan 07       Gift Received        +$200.00  $5,184.50\n" +
                "Jan 08       Netflix              -$25.00   $5,159.50\n" +
                "Jan 09       Transfer Received    +$300.00  $5,459.50\n" +
                "Jan 10       Grocery Store        -$35.00   $5,424.50\n" +
                "Jan 11       Amazon Purchase      -$89.99   $5,334.51\n" +
                "Jan 12       Salary Credit        +$750.00  $6,084.51\n" +
                "Jan 13       Starbucks            -$45.50   $6,039.01\n" +
                "Jan 14       Withdrawal           -$120.00  $5,919.01\n" +
                "Jan 15       Deposit              +$500.00  $6,419.01\n" +
                "===============================================\n" +
                "Closing Balance: $" + formatBalance(currentBalance) + "\n" +
                "===============================================";

        statementArea.setText(statement);

        JScrollPane scrollPane = new JScrollPane(statementArea);

        // === NEW: PDF Export Button ===
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton pdfBtn = new JButton("Export as PDF");
        pdfBtn.setBackground(new Color(40, 167, 69));
        pdfBtn.setForeground(Color.WHITE);
        pdfBtn.addActionListener(e -> exportToPDF(statement));
        buttonPanel.add(pdfBtn);

        JPanel dialogPanel = new JPanel(new BorderLayout());
        dialogPanel.add(scrollPane, BorderLayout.CENTER);
        dialogPanel.add(buttonPanel, BorderLayout.SOUTH);

        JOptionPane.showMessageDialog(this, dialogPanel, "Account Statement", JOptionPane.PLAIN_MESSAGE);
    }

    // === NEW: PDF Export Method ===
    private void exportToPDF(String statementText) {
        String filename = "bank_statement_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".pdf";

        // Simulate PDF generation
        JOptionPane.showMessageDialog(this,
                "✅ PDF Statement Generated!\n\n" +
                        "File: " + filename + "\n" +
                        "Location: Documents/BankStatements/\n\n" +
                        "Statement includes:\n" +
                        "• Account Information\n" +
                        "• Transaction History\n" +
                        "• Current Balance\n" +
                        "• Bank Seal & Signature",
                "PDF Export Successful",
                JOptionPane.INFORMATION_MESSAGE);

        // In real implementation, add iTextPDF library:
        /*
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filename));
            document.open();
            document.add(new Paragraph("BANK STATEMENT"));
            document.add(new Paragraph(statementText));
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
    }

    private void showAccountDetailsDialog() {
        String details = "┌─────────────────────────────────────┐\n" +
                "│        ACCOUNT DETAILS               │\n" +
                "├─────────────────────────────────────┤\n" +
                "│ Account Holder: Test User           │\n" +
                "│ Account Number: ****1234            │\n" +
                "│ Account Type: Savings Account       │\n" +
                "│ Branch: Main Street Branch          │\n" +
                "│ Opening Date: January 1, 2023       │\n" +
                "│ Current Balance: $" + String.format("%12s", formatBalance(currentBalance)) + " │\n" +
                "│ Status: Active                      │\n" +
                "│ Last Transaction: Today             │\n" +
                "│ Contact: customer@bank.com          │\n" +
                "└─────────────────────────────────────┘";

        JTextArea detailsArea = new JTextArea(details);
        detailsArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        detailsArea.setEditable(false);
        JOptionPane.showMessageDialog(this, detailsArea, "Account Details", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showAllTransactions() {
        JTextArea allTransactions = new JTextArea(25, 60);
        allTransactions.setFont(new Font("Monospaced", Font.PLAIN, 11));
        allTransactions.setEditable(false);

        // Generate more transactions
        StringBuilder sb = new StringBuilder();
        sb.append("════════════════════════════════════════════════════════════════════════════════\n");
        sb.append("                           COMPLETE TRANSACTION HISTORY\n");
        sb.append("════════════════════════════════════════════════════════════════════════════════\n");
        sb.append("DATE & TIME          DESCRIPTION                    AMOUNT       STATUS\n");
        sb.append("───────────────────────────────────────────────────────────────────────────────\n");

        String[] allTx = {
                "Jan 15, 2024 09:30 AM   Deposit                      +$500.00     Completed",
                "Jan 14, 2024 02:15 PM   ATM Withdrawal               -$120.00     Completed",
                "Jan 13, 2024 11:45 AM   Starbucks Purchase           -$45.50      Completed",
                "Jan 12, 2024 04:30 PM   Salary Credit                +$750.00     Completed",
                "Jan 11, 2024 10:20 AM   Amazon Online Shopping       -$89.99      Completed",
                "Jan 10, 2024 01:45 PM   Grocery Store                -$35.00      Completed",
                "Jan 09, 2024 08:15 AM   Transfer from John Doe       +$300.00     Completed",
                "Jan 08, 2024 12:30 PM   Netflix Subscription         -$25.00      Completed",
                "Jan 07, 2024 03:45 PM   Birthday Gift                +$200.00     Completed",
                "Jan 06, 2024 10:00 AM   Coffee Shop                  -$15.50      Completed",
                "Jan 05, 2024 02:00 PM   Utility Bill Payment         -$150.00     Completed",
                "Jan 04, 2024 11:30 AM   Mobile Recharge              -$20.00      Completed",
                "Jan 03, 2024 03:15 PM   Restaurant Bill              -$65.00      Completed",
                "Jan 02, 2024 09:45 AM   Transfer to Family           -$200.00     Completed",
                "Jan 01, 2024 12:00 PM   New Year Bonus               +$1000.00    Completed"
        };

        for (String tx : allTx) {
            sb.append(tx).append("\n");
        }

        sb.append("════════════════════════════════════════════════════════════════════════════════\n");
        sb.append("Total Transactions: 15                                                       \n");
        sb.append("════════════════════════════════════════════════════════════════════════════════\n");

        allTransactions.setText(sb.toString());

        JScrollPane scrollPane = new JScrollPane(allTransactions);
        JOptionPane.showMessageDialog(this, scrollPane, "Complete Transaction History", JOptionPane.PLAIN_MESSAGE);
    }

    private String formatBalance(double amount) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(amount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProfessionalDashboard dashboard = new ProfessionalDashboard("TestUser");
            dashboard.setVisible(true);
        });
    }
}