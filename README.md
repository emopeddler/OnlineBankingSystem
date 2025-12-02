<!-- TOP BANNER (full width) -->
<p align="center" style="margin-top:0">
  <img src="assets/banner.png" alt="Top Banner" style="max-width:100%; width:100%;">
</p>

<!-- Project title exactly below the banner -->
<h1 align="center" style="margin: 18px 0 6px 0;">OnlineBankingSystem</h1>

<!-- Badges row in the same sequence as your phone screenshot.
     We use two small grouped lines so they appear stacked the same way on wide screens,
     and keep the order/spacing identical to your phone layout. -->
<p align="center" style="margin: 8px 0 18px 0;">
  <img src="https://img.shields.io/badge/JAVA-17-grey?style=for-the-badge" alt="JAVA" />
  <img src="https://img.shields.io/badge/17-blue?style=for-the-badge" alt="17" />
  <img src="https://img.shields.io/badge/UI-grey?style=for-the-badge" alt="UI" />
  <img src="https://img.shields.io/badge/SWING-purple?style=for-the-badge" alt="Swing" />
</p>

<p align="center" style="margin: 0 0 18px 0;">
  <img src="https://img.shields.io/badge/PLATFORM-grey?style=for-the-badge" alt="Platform" />
  <img src="https://img.shields.io/badge/DESKTOP-brightgreen?style=for-the-badge" alt="Desktop" />
</p>

<hr />

<!-- Architecture image centered and constrained to keep a nice width on desktop -->
<div style="max-width:1000px; margin: 18px auto 6px auto;">
  <img src="assets/banner1.png" alt="Architecture Diagram" style="display:block; width:100%; height:auto; border: 6px solid #fff;">
  <!-- Database badge LEFT-aligned relative to the image (this keeps the badge visually aligned
       to the left edge of the architecture image just like your phone shot) -->
  <div style="width:100%; display:flex; justify-content:flex-start; margin-top:12px;">
    <span style="display:inline-block; margin-left:8px;">
      <img src="https://img.shields.io/badge/Database-MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL" />
    </span>
  </div>
</div>

<hr />


---

<!-- CENTERED ARCHITECTURE IMAGE (90% Width) -->
<div align="center">
  <img src="assets/banner1.png" width="90%" alt="Architecture Diagram">
</div>

<!-- BADGE THAT ALIGNS TO THE LEFT EDGE OF THE IMAGE -->
<div style="width:90%; margin:auto; text-align:left;">
  <img src="https://img.shields.io/badge/Database-MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
</div>

---


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
