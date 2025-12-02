<!-- ===== Header: badges above the banner ===== -->
<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java" alt="Java" />
  <img src="https://img.shields.io/badge/UI-Swing-purple?style=for-the-badge&logo=appsignal" alt="Swing" />
  <img src="https://img.shields.io/badge/Platform-Desktop-success?style=for-the-badge&logo=windows" alt="Desktop" />
  <img src="https://img.shields.io/badge/Database-MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL" />
</p>

<!-- ===== Architecture banner (centered & responsive) ===== -->
<p align="center">
  <!-- If your architecture file is named banner.png instead of banner1.png, change the filename below -->
  <img src="assets/banner1.png" alt="Java Online Banking System Architecture" style="max-width:100%; width:900px; height:auto;">
</p>

<!-- ===== GIF demo after the banner ===== -->
<p align="center">
  <!-- If you don't have demo.gif, replace with a PNG: assets/demo.png -->
  <img src="assets/demo.gif" alt="App Demo GIF" style="max-width:100%; width:720px; height:auto;">
</p>

---

# OnlineBankingSystem

---

## 📑 Table of Contents
- [Overview](#overview)
- [Tech Stack](#tech-stack)
- [App Demo (GIF Preview)](#app-demo-gif-preview)
- [Application Screenshots](#application-screenshots)
- [Features](#features)
- [Project Structure](#project-structure)
- [Database Setup](#database-setup)
- [How to Run](#how-to-run)
- [Release Notes](#release-notes)
- [Author](#author)
- [Connect With Me](#connect-with-me)

---

## 📱 App Demo (GIF Preview)

*(Demo is shown above the title/banner area — scroll up if needed.)*

---

## 🌐 Overview

A Java-based **Online Banking System** created using Java Swing and JDBC.

This student project demonstrates login/authentication, a simple dashboard UI, account management, fund transfers, PDF statement export, and MySQL persistence.

---

## 🛠 Tech Stack
- Java 17  
- Swing UI  
- MySQL  
- JDBC  
- PDF export (iText / similar)

---

## 🖼 Application Screenshots

### 🔹 Login & Dashboard
<p align="center">
  <img src="assets/01_login.png" width="350" alt="Login Screen">
  <img src="assets/03_dashboard.png" width="350" alt="Dashboard">
</p>

### 🔹 Deposit & Deposit Success
<p align="center">
  <img src="assets/04_deposit.png" width="350" alt="Deposit">
  <img src="assets/05_deposit_success.png" width="350" alt="Deposit Success">
</p>

### 🔹 Account Details & Transfer
<p align="center">
  <img src="assets/06_account_details.png" width="350" alt="Account Details">
  <img src="assets/07_transfer.png" width="350" alt="Transfer">
</p>

### 🔹 Account Statement
<p align="center">
  <img src="assets/08_statement.png" width="350" alt="Account Statement">
</p>

---

## ⭐ Features
- User login (simple authentication)
- Interactive dashboard
- Deposit / Withdraw funds
- Transfer money between accounts
- Transaction history viewer
- Account details viewer
- PDF statement export
- Notification panel (UI demo)

---

## 📁 Project Structure

OnlineBankingSystem/
│
├── src/com/bank/system/ # Java source code
├── assets/ # Screenshots / GIF / Images
├── sql/ # Database scripts (bank_db.sql)
├── README.md # Project documentation
└── .gitignore

---

## 🗄️ Database Setup

1. Open **MySQL Workbench** or **phpMyAdmin**.  
2. Run the SQL script located at `sql/bank_db.sql`.  
3. Update the DB credentials in `src/com/bank/system/DBConnection.java` (URL, user, password).

---

## ▶️ How to Run

1. Install **JDK 11** (or above).  
2. Open the project in **IntelliJ IDEA** (or your preferred IDE).  
3. Add the MySQL Connector/J jar to project libraries.  
4. Run the `Main.java` class (or `src/com/bank/system/Main.java`).

---

## 📝 Release Notes

### 🎓 v1.0 — Initial Student Project Release

**Completed**
- Login + Dashboard  
- Deposit / Withdraw / Transfer  
- Account Details  
- Transaction History  
- PDF Export  
- MySQL Connectivity

**Improvements made**
- Cleaner UI layout  
- Fixed basic input validation issues  
- Smoother navigation between screens

**Planned (optional future work)**
- Dark mode UI  
- Animated UI flows  
- Password encryption (secure storage)

---

## 👨‍💻 Author
**SUMIT KAUSHAL**  
BTech CSE, 3rd Semester — Galgotias University

---

## 🤝 Connect With Me
<p align="center">
  <a href="https://github.com/emopeddler" target="_blank">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub">
  </a>
</p>

<p align="center">Made by Sumit Kaushal</p>
