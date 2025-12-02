<!-- ===== START: Custom header block - paste ONLY this and remove previous header/banner blocks ===== -->

<!-- Top banner (full width) -->
<p align="center" style="margin:0 0 8px 0;">
  <img src="assets/banner.png" alt="Top Banner" style="max-width:100%; width:100%; display:block;">
</p>

<!-- Title (big, exactly below banner) -->
<h1 align="center" style="margin: 10px 0 6px 0; font-size:44px; line-height:1.05;">OnlineBankingSystem</h1>

<!-- BADGES: perfectly centered, single horizontal row -->
<p align="center">

  <!-- TOP ROW -->
  <img src="https://img.shields.io/badge/JAVA-FFFFFF?style=flat&labelColor=5A5A5A&color=5A5A5A" />
  <img src="https://img.shields.io/badge/17-FFFFFF?style=flat&labelColor=008CDB&color=008CDB" />
  <img src="https://img.shields.io/badge/UI-FFFFFF?style=flat&labelColor=5A5A5A&color=5A5A5A" />
  <img src="https://img.shields.io/badge/SWING-FFFFFF?style=flat&labelColor=9C00A7&color=9C00A7" />

  <br><br>

  <!-- BOTTOM ROW -->
  <img src="https://img.shields.io/badge/PLATFORM-FFFFFF?style=flat&labelColor=5A5A5A&color=5A5A5A" />
  <img src="https://img.shields.io/badge/DESKTOP-FFFFFF?style=flat&labelColor=38D100&color=38D100" />

</p>

  <!-- second row beneath the first, keeps the same centered alignment -->

<hr style="border:none; height:4px; background-color: #2f3640; margin: 10px 0 20px 0;" />

<!-- Architecture image: centered in a fixed-width container so badges can align to its left exactly -->
<div style="max-width:1000px; margin: 0 auto 6px auto; position:relative;">
  <img src="assets/banner1.png" alt="Architecture Diagram" style="width:100%; height:auto; display:block; border: 6px solid transparent;">
  <!-- Database badge placed left-aligned relative to the image container -->
  <div style="display:flex; justify-content:flex-start; width:100%; margin-top:12px;">
    <!-- tweak margin-left here if you want pixel-perfect nudging (default 6px) -->
    <div style="margin-left:6px;">
      <img src="https://img.shields.io/badge/Database-MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
    </div>
  </div>
</div>

<hr style="border:none; height:4px; background-color: #2f3640; margin: 18px 0;" />

<!-- ===== END: Custom header block ===== -->



## 📑 Table of Contents
- [App Demo (GIF Preview)](#app-demo-gif-preview)
- [Overview](#overview)
- [Tech Stack](#tech-stack)
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

<p align="center">
  <img src="assets/demo.gif" alt="App demo" style="max-width:100%; width:760px; height:auto;">
</p>

---

## 🌐 Overview

A Java-based **Online Banking System** built with Java Swing and JDBC.  
Includes login, dashboard, transactions, account management, PDF export and MySQL storage.

---

## 🛠 Tech Stack
- Java 17  
- Swing UI  
- MySQL  
- JDBC  
- PDF Export  

---

## 🖼 Application Screenshots

### 🔹 Login & Dashboard  
<p align="center">
  <img src="assets/01_login.png" width="350" alt="Login">
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
  <img src="assets/08_statement.png" width="350" alt="Statement">
</p>

---

## ⭐ Features
- Login system  
- Interactive dashboard  
- Deposit / Withdraw / Transfer  
- Transaction history  
- Account details viewer  
- PDF statement export  
- Notification panel  

---

## 📁 Project Structure
OnlineBankingSystem/
├── src/com/bank/system/ # Java source code
├── assets/ # Screenshots / GIF / Images
├── sql/bank_db.sql # Database schema
├── README.md # Documentation
└── .gitignore

---

## 🗄️ Database Setup
1. Open **MySQL Workbench / phpMyAdmin**  
2. Run SQL script: `sql/bank_db.sql`  
3. Update DB credentials: `src/com/bank/system/DBConnection.java`

---

## ▶️ How to Run
1. Install **JDK 11+**  
2. Open project in **IntelliJ IDEA**  
3. Add MySQL Connector/J to libraries  
4. Run `Main.java`

---

## 📝 Release Notes — v1.0 (Student Project)
**Completed**: Login, Dashboard, Deposit/Withdraw/Transfer, Transaction history, PDF export, MySQL connectivity.  
**Improvements**: cleaner UI, input validation fixes, smoother navigation.  
**Optional future**: Dark mode, animated UI, encrypted passwords.

---

## 👨‍💻 Author
**SUMIT KAUSHAL** — BTech CSE, 3rd Semester, Galgotias University

---

## 🤝 Connect With Me
<p align="center">
  <a href="https://github.com/emopeddler">
    <img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"/>
  </a>
</p>

<p align="center">Made by Sumit Kaushal</p>
