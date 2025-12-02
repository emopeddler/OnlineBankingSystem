package com.bank.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleLoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public SimpleLoginFrame() {
        // Basic setup
        setTitle("Bank Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 550); // Increased height for new features
        setLocationRelativeTo(null);
        setResizable(false);

        // Create main panel with gradient
        JPanel mainPanel = new GradientPanel(new Color(240, 245, 255), new Color(255, 255, 255));
        mainPanel.setLayout(new BorderLayout());

        // Create content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setOpaque(false);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        // Logo/Title
        JLabel titleLabel = new JLabel("BANK LOGIN");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
        titleLabel.setForeground(new Color(0, 123, 255));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel subtitleLabel = new JLabel("Secure Banking System");
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        subtitleLabel.setForeground(new Color(108, 117, 125));
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Spacer
        contentPanel.add(Box.createVerticalStrut(30));

        // Username panel
        JPanel usernamePanel = new JPanel();
        usernamePanel.setLayout(new BoxLayout(usernamePanel, BoxLayout.Y_AXIS));
        usernamePanel.setOpaque(false);
        usernamePanel.setMaximumSize(new Dimension(400, 70));

        JLabel userLabel = new JLabel("Username");
        userLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        userLabel.setForeground(new Color(73, 80, 87));
        userLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPanel userFieldPanel = new JPanel(new BorderLayout());
        userFieldPanel.setBackground(Color.WHITE);
        userFieldPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(206, 212, 218), 1),
                BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));
        userFieldPanel.setMaximumSize(new Dimension(400, 45));

        // Using text icon
        JLabel userIcon = new JLabel("U:");
        userIcon.setFont(new Font("Segoe UI", Font.BOLD, 14));
        userIcon.setForeground(new Color(0, 123, 255));
        userIcon.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));

        usernameField = new JTextField();
        usernameField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        usernameField.setBorder(null);

        userFieldPanel.add(userIcon, BorderLayout.WEST);
        userFieldPanel.add(usernameField, BorderLayout.CENTER);

        usernamePanel.add(userLabel);
        usernamePanel.add(Box.createVerticalStrut(10));
        usernamePanel.add(userFieldPanel);

        // Password panel
        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new BoxLayout(passwordPanel, BoxLayout.Y_AXIS));
        passwordPanel.setOpaque(false);
        passwordPanel.setMaximumSize(new Dimension(400, 70));

        JLabel passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        passLabel.setForeground(new Color(73, 80, 87));
        passLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JPanel passFieldPanel = new JPanel(new BorderLayout());
        passFieldPanel.setBackground(Color.WHITE);
        passFieldPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(206, 212, 218), 1),
                BorderFactory.createEmptyBorder(10, 15, 10, 15)
        ));
        passFieldPanel.setMaximumSize(new Dimension(400, 45));

        // Using asterisk
        JLabel passIcon = new JLabel("***");
        passIcon.setFont(new Font("Segoe UI", Font.BOLD, 12));
        passIcon.setForeground(new Color(0, 123, 255));
        passIcon.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        passwordField.setBorder(null);

        passFieldPanel.add(passIcon, BorderLayout.WEST);
        passFieldPanel.add(passwordField, BorderLayout.CENTER);

        passwordPanel.add(passLabel);
        passwordPanel.add(Box.createVerticalStrut(10));
        passwordPanel.add(passFieldPanel);

        // === NEW: Biometric Authentication Options ===
        JPanel biometricPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        biometricPanel.setOpaque(false);
        biometricPanel.setMaximumSize(new Dimension(400, 50));

        JButton fingerprintBtn = new JButton("Use Fingerprint");
        fingerprintBtn.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        fingerprintBtn.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        fingerprintBtn.setBackground(new Color(230, 230, 230));
        fingerprintBtn.addActionListener(e -> useBiometric("Fingerprint"));

        JButton faceBtn = new JButton("Use Face ID");
        faceBtn.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        faceBtn.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        faceBtn.setBackground(new Color(230, 230, 230));
        faceBtn.addActionListener(e -> useBiometric("Face ID"));

        biometricPanel.add(fingerprintBtn);
        biometricPanel.add(faceBtn);

        // Login button
        JButton loginBtn = new JButton("LOGIN");
        loginBtn.setBackground(new Color(0, 123, 255));
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setFont(new Font("Segoe UI", Font.BOLD, 16));
        loginBtn.setBorder(BorderFactory.createEmptyBorder(15, 40, 15, 40));
        loginBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginBtn.setMaximumSize(new Dimension(250, 55));
        loginBtn.setFocusPainted(false);
        loginBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Add hover effect
        loginBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                loginBtn.setBackground(new Color(0, 105, 217));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                loginBtn.setBackground(new Color(0, 123, 255));
            }
        });

        loginBtn.addActionListener(e -> performLogin());

        // Add Enter key listener to password field
        passwordField.addActionListener(e -> performLogin());

        // === NEW: Registration Button ===
        JButton registerBtn = new JButton("New User? Register Here");
        registerBtn.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        registerBtn.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        registerBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        registerBtn.addActionListener(e -> {
            new RegistrationFrame().setVisible(true);
        });

        // Test Database button
        JButton testBtn = new JButton("Try Database Login");
        testBtn.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        testBtn.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        testBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        testBtn.addActionListener(e -> tryDatabaseLogin());

        // Footer
        JLabel footerLabel = new JLabel("Secure Banking System v3.0");
        footerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        footerLabel.setForeground(new Color(108, 117, 125));
        footerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Add all components to content panel
        contentPanel.add(titleLabel);
        contentPanel.add(Box.createVerticalStrut(5));
        contentPanel.add(subtitleLabel);
        contentPanel.add(Box.createVerticalStrut(40));
        contentPanel.add(usernamePanel);
        contentPanel.add(Box.createVerticalStrut(20));
        contentPanel.add(passwordPanel);
        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(biometricPanel);
        contentPanel.add(Box.createVerticalStrut(20));
        contentPanel.add(loginBtn);
        contentPanel.add(Box.createVerticalStrut(10));
        contentPanel.add(registerBtn);
        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(testBtn);
        contentPanel.add(Box.createVerticalGlue());
        contentPanel.add(footerLabel);

        mainPanel.add(contentPanel, BorderLayout.CENTER);
        add(mainPanel);
    }

    private void performLogin() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());

        // Validate inputs
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter your username",
                    "Validation Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Show welcome message
        JOptionPane.showMessageDialog(this,
                "Welcome " + username + "!\nOpening your dashboard...",
                "Login Successful",
                JOptionPane.INFORMATION_MESSAGE);

        // Close login window
        this.dispose();

        // Open PROFESSIONAL DASHBOARD
        SwingUtilities.invokeLater(() -> {
            ProfessionalDashboard dashboard = new ProfessionalDashboard(username);
            dashboard.setVisible(true);
        });
    }

    // === NEW: Biometric Authentication Method ===
    private void useBiometric(String type) {
        // Simulate biometric scanning
        JOptionPane.showMessageDialog(this,
                "Please place your " + (type.equals("Fingerprint") ? "finger on the scanner" : "face in front of camera") + "\n\n" +
                        "Scanning...",
                type + " Authentication",
                JOptionPane.INFORMATION_MESSAGE);

        // Simulate processing delay
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(SimpleLoginFrame.this,
                        type + " verified successfully!\nWelcome back!\n\n" +
                                "Opening dashboard...",
                        "Authentication Successful",
                        JOptionPane.INFORMATION_MESSAGE);

                SimpleLoginFrame.this.dispose();
                SwingUtilities.invokeLater(() -> {
                    ProfessionalDashboard dashboard = new ProfessionalDashboard("Biometric User");
                    dashboard.setVisible(true);
                });
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    private void tryDatabaseLogin() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please enter both username and password",
                    "Input Required",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            AccountDAO accountDAO = new AccountDAO();
            Customer customer = accountDAO.authenticateUser(username, password);

            if (customer != null) {
                JOptionPane.showMessageDialog(this,
                        "Database Login Successful!\nWelcome " + customer.getUsername(),
                        "Database Connected",
                        JOptionPane.INFORMATION_MESSAGE);

                this.dispose();
                SwingUtilities.invokeLater(() -> {
                    ProfessionalDashboard dashboard = new ProfessionalDashboard(customer.getUsername());
                    dashboard.setVisible(true);
                });
            } else {
                JOptionPane.showMessageDialog(this,
                        "Database Login Failed\nNo user found",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Database Error\n" + e.getMessage() +
                            "\n\nUsing direct login instead...",
                    "Database Error",
                    JOptionPane.WARNING_MESSAGE);

            this.dispose();
            SwingUtilities.invokeLater(() -> {
                ProfessionalDashboard dashboard = new ProfessionalDashboard(username);
                dashboard.setVisible(true);
            });
        }
    }

    // Gradient Panel
    class GradientPanel extends JPanel {
        private Color startColor;
        private Color endColor;

        public GradientPanel(Color start, Color end) {
            this.startColor = start;
            this.endColor = end;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            int w = getWidth();
            int h = getHeight();
            GradientPaint gp = new GradientPaint(0, 0, startColor, 0, h, endColor);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, w, h);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleLoginFrame loginFrame = new SimpleLoginFrame();
            loginFrame.setVisible(true);
        });
    }
}