# BDD Cucumber with Selenium and TestNG

## Overview
This project is a Behavior-Driven Development (BDD) automation framework using **Cucumber**, **Selenium WebDriver**, and **TestNG**. It automates the login functionality for a sample form and follows the **Page Object Model (POM)** for maintainability.

## Features
- **Selenium WebDriver** for browser automation
- **Cucumber BDD** for writing test scenarios
- **TestNG** as the test runner
- **Page Object Model (POM)** for structured test automation
- Generates **HTML Reports** using Cucumber plugins

BDD_Cucumber/ │── src/ │ ├── main/ │ │ ├── java/ │ │ │ ├── Page_Objects/ # Page Object Model (POM) classes │ │ ├── resources/ │── src/ │ ├── test/ │ │ ├── java/ │ │ │ ├── StepDefination/ # Cucumber Step Definitions │ │ │ ├── testRunner/ # TestNG Runner class │ │ ├── resources/ │ │ │ ├── features/ # Cucumber Feature files │── pom.xml # Maven dependencies │── README.md # Project documentation

## Setup and Installation

### Prerequisites
- Java 8 or later
- Maven installed (`mvn -version` to check)
- Google Chrome and ChromeDriver
- IDE (Eclipse, IntelliJ, or VS Code)

### Steps to Set Up
1. Clone the repository:
   ```sh
   git clone https://github.com/Shubham-089/CI-CD-Jenkins-Integration-with-Selenium_ASSIGNMENT.git
