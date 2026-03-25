# 📦 StoreApp - Product Sorting System

## 📖 Overview

**StoreApp** is a simple Java-based application that simulates a product inventory system with multiple sorting capabilities. It demonstrates the use of object-oriented programming concepts such as classes, encapsulation, interfaces, and comparators.

The application allows products to be sorted based on different criteria like **price**, **rating**, and **popularity**, making it similar to real-world e-commerce filtering systems.

---

## 🚀 Features

* Add products to an inventory
* Sort products by:

  * Default (Price: Low → High)
  * Rating (High → Low)
  * Popularity (Most Reviews → Least)
* Display sorted results dynamically
* Uses `Comparable` and `Comparator` for flexible sorting

---

## 🧱 Project Structure

### 1. `Product` Class

Represents a product with the following attributes:

* `id` – Unique product identifier
* `name` – Product name
* `price` – Product price
* `rating` – Average user rating
* `totalReviews` – Number of reviews

#### Key Functionalities:

* Implements `Comparable<Product>` to define default sorting (by price)
* Overrides `toString()` for clean output display

---

### 2. `ServiceEngine` Class

Acts as the core service layer handling business logic.

#### Responsibilities:

* Managing product inventory (`ArrayList<Product>`)
* Adding new products
* Sorting products using:

  * `Collections.sort()` (default sorting)
  * Custom `Comparator` (rating & popularity)

#### Sorting Methods:

* `sortByDefault()` → Price (ascending)
* `sortByRatingDesc()` → Rating (descending)
* `sortByPopularityDesc()` → Total reviews (descending)

---

### 3. `StoreApp` (Main Class)

Entry point of the application.

#### Workflow:

1. Create product list
2. Initialize `ServiceEngine`
3. Apply different sorting methods
4. Display results

---

## 🖥️ Sample Output

```
--- Default View (Price: Low to High) ---
Product [id=P4, name=Watch, price=199.99, rating=4.6, totalReviews=100]
Product [id=P3, name=Tablet, price=299.99, rating=4.2, totalReviews=150]
Product [id=P2, name=Phone, price=499.99, rating=4.8, totalReviews=350]
Product [id=P1, name=Laptop, price=999.99, rating=4.5, totalReviews=200]

--- User Selected: Top Rated ---
Product [id=P2, name=Phone, price=499.99, rating=4.8, totalReviews=350]
Product [id=P4, name=Watch, price=199.99, rating=4.6, totalReviews=100]
Product [id=P1, name=Laptop, price=999.99, rating=4.5, totalReviews=200]
Product [id=P3, name=Tablet, price=299.99, rating=4.2, totalReviews=150]
```

---

## ⚠️ Note

There is a small issue in the `main` method:

```java
engine.sortByRatingDesc();
engine.displayResults("\n--- User Selected: Most Popular ---");
```

👉 This should call:

```java
engine.sortByPopularityDesc();
```

Otherwise, the "Most Popular" view will incorrectly show rating-based sorting again.

---

## 🛠️ Technologies Used

* Java
* Collections Framework (`ArrayList`, `Collections`, `Comparator`)
* OOP Concepts

---

## 📌 Concepts Demonstrated

* Interface implementation (`Comparable`)
* Lambda expressions for sorting
* Separation of concerns (Model vs Service)
* Clean and reusable design

---

## 🔮 Future Improvements

* Add search functionality (by name or ID)
* Filter products by price range
* Persist data using file handling or database
* Add user interaction (menu-driven system)

---

## 📜 Conclusion

This project is a clean and practical example of implementing sorting logic in Java using both **natural ordering** and **custom comparators**. It lays a strong foundation for building more advanced inventory or e-commerce systems.

---
