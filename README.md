<!-- ===== START: Custom header block - paste ONLY this and remove previous header/banner blocks ===== -->

<!-- Top banner (full width) -->
<p align="center" style="margin:0 0 8px 0;">
  <img src="assets/banner.png" alt="Top Banner" style="max-width:100%; width:100%; display:block;">
</p>

<!-- Title (big, exactly below banner) -->
<h1 align="center" style="margin: 10px 0 6px 0; font-size:44px; line-height:1.05;">OnlineBankingSystem</h1>

<!-- BADGES: perfectly centered, single horizontal row -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GitHub Badges - Horizontal Layout</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        
        body {
            background-color: #0d1117;
            color: #c9d1d9;
            padding: 40px 20px;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        
        .container {
            max-width: 900px;
            width: 100%;
        }
        
        header {
            text-align: center;
            margin-bottom: 40px;
        }
        
        h1 {
            color: #58a6ff;
            margin-bottom: 10px;
            font-size: 2.5rem;
        }
        
        .subtitle {
            color: #8b949e;
            font-size: 1.1rem;
            max-width: 600px;
            margin: 0 auto;
        }
        
        .badge-container {
            background-color: #161b22;
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
            border: 1px solid #30363d;
            margin-bottom: 40px;
        }
        
        .badge-title {
            color: #c9d1d9;
            font-size: 1.2rem;
            margin-bottom: 20px;
            text-align: center;
            font-weight: 600;
        }
        
        .badges-horizontal {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            gap: 12px;
        }
        
        .badge {
            display: flex;
            align-items: center;
            border-radius: 6px;
            overflow: hidden;
            height: 28px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.2);
            transition: transform 0.2s, box-shadow 0.2s;
        }
        
        .badge:hover {
            transform: translateY(-3px);
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
        }
        
        .badge-label {
            padding: 0 12px;
            font-weight: 600;
            font-size: 14px;
            height: 100%;
            display: flex;
            align-items: center;
        }
        
        .badge-value {
            padding: 0 12px;
            font-weight: 600;
            font-size: 14px;
            height: 100%;
            display: flex;
            align-items: center;
        }
        
        .java-badge .badge-label {
            background-color: #007396;
            color: white;
        }
        
        .java-badge .badge-value {
            background-color: #f8981d;
            color: #000;
        }
        
        .swing-badge .badge-label {
            background-color: #3d85c6;
            color: white;
        }
        
        .swing-badge .badge-value {
            background-color: #e7e7e7;
            color: #000;
        }
        
        .platform-badge .badge-label {
            background-color: #6f42c1;
            color: white;
        }
        
        .platform-badge .badge-value {
            background-color: #e7e7e7;
            color: #000;
        }
        
        .desktop-badge .badge-label {
            background-color: #22863a;
            color: white;
        }
        
        .desktop-badge .badge-value {
            background-color: #f6f8fa;
            color: #000;
        }
        
        .instructions {
            background-color: #161b22;
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
            border: 1px solid #30363d;
        }
        
        .instructions h2 {
            color: #58a6ff;
            margin-bottom: 20px;
            font-size: 1.8rem;
        }
        
        .instructions ol {
            margin-left: 20px;
            margin-bottom: 25px;
        }
        
        .instructions li {
            margin-bottom: 12px;
            line-height: 1.5;
        }
        
        .instructions code {
            background-color: #0d1117;
            padding: 3px 8px;
            border-radius: 4px;
            font-family: 'Courier New', monospace;
            color: #c9d1d9;
            border: 1px solid #30363d;
        }
        
        .code-block {
            background-color: #0d1117;
            padding: 20px;
            border-radius: 8px;
            overflow-x: auto;
            font-family: 'Courier New', monospace;
            color: #c9d1d9;
            border: 1px solid #30363d;
            margin-top: 10px;
        }
        
        .note {
            background-color: rgba(88, 166, 255, 0.1);
            border-left: 4px solid #58a6ff;
            padding: 15px;
            border-radius: 0 4px 4px 0;
            margin-top: 20px;
        }
        
        .copy-button {
            background-color: #238636;
            color: white;
            border: none;
            padding: 8px 16px;
            border-radius: 6px;
            cursor: pointer;
            font-weight: 600;
            margin-top: 15px;
            transition: background-color 0.2s;
        }
        
        .copy-button:hover {
            background-color: #2ea043;
        }
        
        .success-message {
            color: #3fb950;
            margin-top: 10px;
            font-weight: 600;
            opacity: 0;
            transition: opacity 0.3s;
        }
        
        footer {
            margin-top: 40px;
            text-align: center;
            color: #8b949e;
            font-size: 0.9rem;
        }
        
        @media (max-width: 768px) {
            .badges-horizontal {
                gap: 8px;
            }
            
            .badge {
                height: 26px;
            }
            
            .badge-label, .badge-value {
                font-size: 13px;
                padding: 0 10px;
            }
        }
        
        @media (max-width: 480px) {
            .badges-horizontal {
                flex-direction: column;
                align-items: center;
            }
            
            .badge {
                width: 220px;
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <header>
            <h1>GitHub Badges</h1>
            <p class="subtitle">Horizontal badge layout for your repository README - Similar to your image but in a horizontal sequence</p>
        </header>
        
        <div class="badge-container">
            <div class="badge-title">Badge Preview</div>
            <div class="badges-horizontal">
                <div class="badge java-badge">
                    <div class="badge-label">JAVA</div>
                    <div class="badge-value">17</div>
                </div>
                <div class="badge swing-badge">
                    <div class="badge-label">SWING</div>
                    <div class="badge-value">GUI</div>
                </div>
                <div class="badge platform-badge">
                    <div class="badge-label">PLATFORM</div>
                    <div class="badge-value">DESKTOP</div>
                </div>
            </div>
        </div>
        
        <div class="instructions">
            <h2>How to Use These Badges</h2>
            <ol>
                <li>Copy the markdown code below</li>
                <li>Paste it into your GitHub repository's README.md file</li>
                <li>The badges will appear horizontally as shown above</li>
            </ol>
            
            <div class="code-block" id="markdown-code">
                [![Java](https://img.shields.io/badge/JAVA-17-f8981d?style=for-the-badge&logo=openjdk&logoColor=black)](https://www.java.com/) &nbsp;
                [![Swing](https://img.shields.io/badge/SWING-GUI-3d85c6?style=for-the-badge&logo=java&logoColor=white)](https://docs.oracle.com/javase/tutorial/uiswing/) &nbsp;
                [![Platform](https://img.shields.io/badge/PLATFORM-DESKTOP-6f42c1?style=for-the-badge&logo=desktop&logoColor=white)](https://desktop.github.com/)
            </div>
            
            <button class="copy-button" id="copy-btn">Copy Markdown Code</button>
            <div class="success-message" id="success-msg">Code copied to clipboard!</div>
            
            <div class="note">
                <strong>Note:</strong> These badges use <a href="https://shields.io/" target="_blank" style="color: #58a6ff;">Shields.io</a> service which is commonly used for GitHub badges. The colors have been matched to your original image as closely as possible.
            </div>
        </div>
        
        <footer>
            <p>Badge Generator &copy; 2023 | Designed to match your requested style</p>
        </footer>
    </div>

    <script>
        document.getElementById('copy-btn').addEventListener('click', function() {
            const codeElement = document.getElementById('markdown-code');
            const codeText = codeElement.textContent;
            
            // Create a temporary textarea to copy text
            const textArea = document.createElement('textarea');
            textArea.value = codeText;
            document.body.appendChild(textArea);
            textArea.select();
            document.execCommand('copy');
            document.body.removeChild(textArea);
            
            // Show success message
            const successMsg = document.getElementById('success-msg');
            successMsg.style.opacity = '1';
            
            // Hide message after 3 seconds
            setTimeout(function() {
                successMsg.style.opacity = '0';
            }, 3000);
        });
    </script>
</body>
</html>

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
