 Payment Gateway Simulation (Java)

 Overview

This project is a simple Java-based Payment Gateway simulation that demonstrates how custom exceptions, object-oriented programming, and exception handling can be used in a financial transaction system.

The program processes multiple transactions and validates them using a PaymentProcessor. If a transaction fails validation (invalid card number or insufficient funds), the system throws a custom exception and logs the error accordingly.

This project is useful for understanding:

 Custom exceptions in Java
 Exception handling using `try`, `catch`, and `finally`
 Object-oriented design
 Basic payment validation logic

---

 Project Structure

The project contains the following components:

 1. `Transaction`

Represents a payment transaction.

Attributes

 `transactionId` – Unique ID of the transaction
 `cardNumber` – Credit/Debit card number used
 `amount` – Transaction amount

Responsibilities

 Stores transaction data
 Provides getter methods to access transaction details

---

 2. `PaymentProcessor`

Handles the validation and processing of transactions.

Validation Rules

 Card number must contain exactly 16 digits
 Transaction amount must be less than or equal to 5000

Possible Outcomes

 Transaction approved
 Invalid card detected
 Insufficient funds detected

The method:

```
processPayment(Transaction tx)
```

may throw:

 `InvalidCardException`
 `InsufficientFundsException`

---

 3. Custom Exceptions

 `InvalidCardException`

Thrown when the card number does not contain 16 digits.

Example message:

```
Fraud Alert: Card number must be 16 digits.
```

 `InsufficientFundsException`

Thrown when the transaction amount exceeds $5000.

Example message:

```
Decline: Amount exceeds available balance.
```

Custom exceptions make the system clearer and easier to debug by separating different failure scenarios.

---

 4. `GatewayApp` (Main Class)

This class simulates the payment gateway system.

It performs the following steps:

1. Boots the payment gateway
2. Creates multiple transactions
3. Sends each transaction to the `PaymentProcessor`
4. Handles errors using `try-catch`
5. Logs results
6. Closes the simulated bank connection using `finally`

---

 Program Flow

1. System starts the payment gateway.
2. Three transactions are created.
3. Each transaction is processed sequentially.
4. Validation occurs inside `PaymentProcessor`.
5. If validation fails, a custom exception is thrown.
6. The exception is caught and logged.
7. The `finally` block executes to simulate closing the bank connection.

---

 Example Transactions

| Transaction ID | Card Number      | Amount | Result             |
| -------------- | ---------------- | ------ | ------------------ |
| TX-001         | 1234567887654321 | 100    | Approved           |
| TX-002         | 1234             | 400    | Invalid Card       |
| TX-003         | 1233223344556677 | 9000   | Insufficient Funds |

---

 Example Output

```
--- Booting Payment Gateway ---

[SUCCESS] Transaction TX-001 approved for $100.0
--> Closing secure bank connection for TX-001

[SECURITY LOG] Fraud Alert: Card number must be 16 digits.
--> Closing secure bank connection for TX-002

[BANK LOG] Decline: Amount exceeds available balance.
--> Closing secure bank connection for TX-003
```

---

 Key Java Concepts Demonstrated

 Custom Exceptions

Creating domain-specific exceptions improves program clarity.

 Exception Handling

The system uses:

 `try` – executes transaction processing
 `catch` – handles specific exceptions
 `finally` – ensures cleanup operations always run

 Encapsulation

Transaction data is stored in private fields and accessed through getter methods.

 Object-Oriented Design

Different responsibilities are separated into:

 Transaction data
 Payment processing
 Exception handling
 Application control

---

 How to Run the Program

1. Compile the Java file

```
javac GatewayApp.java
```

2. Run the program

```
java GatewayApp
```

---

 Learning Outcomes

After studying this project, you will understand:

 How to create and use custom exceptions
 How multiple catch blocks work
 Why finally blocks are important
 How a basic payment validation system can be structured in Java

---

 Possible Improvements

This project can be extended by adding:

 Real card number validation (Luhn Algorithm)
 Database storage for transactions
 Logging system
 User input via Scanner
 Multiple payment methods

---

 Author

Java Mini Project demonstrating exception handling in a payment gateway simulation.
