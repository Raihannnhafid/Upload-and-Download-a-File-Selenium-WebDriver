<h1 align="center">
  <em>🔍 File Upload and Download Automation</em>
</h1>

<p align="center">
  <em>Built with the tools and technologies:</em>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-8+-blue?logo=java&style=flat-square" />
  <img src="https://img.shields.io/badge/Maven-3.8+-green?logo=apache-maven&style=flat-square" />
  <img src="https://img.shields.io/badge/TestNG-7.10.2-orange?logo=testng&style=flat-square" />
  <img src="https://img.shields.io/badge/Cucumber-7.15.0-brightgreen?logo=cucumber&style=flat-square" />
  <img src="https://img.shields.io/badge/Selenium-4.34.0-yellow?logo=selenium&style=flat-square" />
  <img src="https://img.shields.io/badge/ExtentReports-5.1.1-red?style=flat-square" />
  <img src="https://img.shields.io/badge/GitHub-Repository-black?logo=github&style=flat-square" />
</p>

---

## 📖 Project Description
This project demonstrates **automated testing** for file **upload** and **download** functionalities in a web-based application. The automation framework is built using **Selenium WebDriver**, **TestNG**, and **Cucumber**, with **ExtentReports** integration for detailed test reporting.

The main objectives of this project are:
- To validate that files can be uploaded successfully in the required format.
- To ensure that files can be downloaded correctly and saved to the local directory.
- To provide a structured and easily readable test report.

---
## 🚀 Quick Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Raihannnhafid/Upload-and-Download-a-File-Selenium-WebDriver.git
   ```
2. **Navigate to the project folder**:
   ```bash
   cd Upload-and-Download-a-File-Selenium-WebDriver
   ```
3. **Open the project in VS Code:**:
   ```bash
   code .
   ```
---
## ▶️ Run All Tests

- To run all automated tests:

```bash
mvn clean test
```

- Run Specific Test Suite
  **To run tests using a specific suite (e.g., main.xml):**

```bash
mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/main.xml
```
---

## 📊 View Test Report

```bash
target/ExtentReports/LaporanPengujian/HtmlReport/ExtentHtml.html
```
🌐 Open this file in your browser to see the detailed test results.

---

