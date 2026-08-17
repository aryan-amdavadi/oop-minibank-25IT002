# 🏦 Object-Oriented Mini Bank System (oop-minibank-25IT002)

[![GitHub License](https://img.shields.io/github/license/aryan-amdavadi/oop-minibank-25IT002?style=flat-square&color=blue)](LICENSE)
[![GitHub Stars](https://img.shields.io/github/stars/aryan-amdavadi/oop-minibank-25IT002?style=flat-square)](https://github.com/aryan-amdavadi/oop-minibank-25IT002/stargazers)
[![GitHub Forks](https://img.shields.io/github/forks/aryan-amdavadi/oop-minibank-25IT002?style=flat-square)](https://github.com/aryan-amdavadi/oop-minibank-25IT002/network/members)
[![Java Version](https://img.shields.io/badge/Java-17%2B-orange?style=flat-square&logo=java)](https://www.oracle.com/java/)

An elegant, robust, and production-ready **Console-Based Mini Banking Application** engineered using core **Object-Oriented Programming (OOP)** principles in Java. This project simulates a real-world banking ecosystem, showcasing clean code architecture, data encapsulation, inheritance, polymorphism, and abstraction.

---

## 🚀 Key Features

*   **👥 Multi-Account Type Ecosystem:** Distinct architectures for Savings and Current accounts with specialized interest and penalty calculation models.
*   **🔒 Secure User Authentication:** Unique account number generation paired with secure PIN/password access controls.
*   **💸 Real-time Transaction Ledger:** Seamless money deposits, withdrawals, and instant peer-to-peer balance transfers.
*   **📜 Dynamic Statement Generation:** Real-time generation of transaction receipts and historical transaction logging.
*   **🛡️ Automated Validation Engines:** Bulletproof input verification to prevent overdraft violations, negative deposits, and unauthorized structural mutations.

---

## 🏛️ OOP Architecture Blueprint

This application serves as a textbook showcase of fundamental Object-Oriented Software Engineering:

```
                  ┌───────────────────────┐
                  │   «abstract» Account  │
                  └───────────┬───────────┘
                              │
             ┌────────────────┴────────────────┐
             ▼                                 ▼
┌─────────────────────────┐       ┌─────────────────────────┐
│     SavingsAccount      │       │     CurrentAccount      │
├─────────────────────────┤       ├─────────────────────────┤
│ - interestRate: double  │       │ - overdraftLimit: double│
│ + calculateInterest()   │       │ + checkOverdraft()      │
└─────────────────────────┘       └─────────────────────────┘
```

*   **Encapsulation:** All sensitive customer data (`balance`, `pin`, `accountNumber`) is strictly isolated using `private` modifiers and safely altered through authenticated public getters and setters.
*   **Abstraction:** Core financial contracts are generalized within an abstract `Account` base class or interfaces, hiding complex back-end operations from the presentation layer.
*   **Inheritance:** Reusable operational logic flows effortlessly from the base `Account` entity to specialized child classes like `SavingsAccount` and `CurrentAccount`.
*   **Polymorphism:** Method overriding rules dynamically route runtime actions (like unique validation parameters or transaction fees) depending on the target account object type.

---

## 📂 Project Directory Structure

```text
oop-minibank-25IT002/
├── .idea/                  # IDE-specific configurations
├── src/                    # Source directory containing pure Java logic
│   └── java/               # Core application modules (Models, Services, App Main)
├── .gitignore              # Standard version control exclusion definitions
└── oop-minibank-25IT002.iml# IntelliJ project architectural module
```

---

## 🛠️ Installation & Getting Started

### Prerequisites
*   **Java Development Kit (JDK) 17** or higher installed. Check via:
    ```bash
    java -version
    ```
*   An IDE of your choice (**IntelliJ IDEA**, **Eclipse**, or **VS Code**).

### Execution Guide

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/aryan-amdavadi/oop-minibank-25IT002.git
   cd oop-minibank-25IT002
   ```

2. **Compile the Source Files:**
   ```bash
   javac -d bin src/**/*.java
   ```

3. **Run the Application:**
   ```bash
   java -cp bin Main
   ```

---

## 💻 System Preview & Interface Flow

```text
==========================================
        WELCOME TO THE MINI-BANK          
==========================================
1. Create a New Account
2. Access Existing Account
3. Exit Application
------------------------------------------
Enter choice: 1

[System] Creating Account...
Select Account Type: (1) Savings  (2) Current
Choice: 1
Enter Name: John Doe
Enter Initial Deposit: $500.00
Set Secure 4-Digit PIN: ****

[Success] Account successfully generated! 
[Success] Your unique Account Number is: MB-25IT002-1001
==========================================
```

---

## 🤝 Contributing

Contributions make the open-source community an amazing place to learn, inspire, and create.
1. Fork the project.
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

---

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

---
*Developed with ❤️ by [aryan-amdavadi](https://github.com/aryan-amdavadi).*
