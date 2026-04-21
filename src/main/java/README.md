# 🛒 Product Catalog Management System (Java CLI)

## 📌 Project Introduction
The Product Catalog Management System is a console application (CLI) built in Java Core, simulating a product management system for a small store.

The project allows:
- **Admin/Shop Owner** to manage catalogs and products (CRUD)

- **Customers** to view, search, and filter products

The project helps apply knowledge of OOP, Collections, File I/O, Multithreading, and JDBC to a real-world system.

---

## 🎯 Learning Objectives
- Build a complete Java CLI application
- Apply OOP (Encapsulation, Inheritance, Polymorphism)
- Work with Collections (ArrayList)
- File processing (Serialization)
- Work with Databases (JDBC)

- Handle multithreading and data synchronization
- Design a system based on a real-world model

---
## ⚙️ Technologies Used
- Java 11+
- Maven / Gradle
- JDBC (MySQL / PostgreSQL)
- File Serialization (early stage)
- Console Application (CLI)

---
## 🧱 System Structure

### 🔹 Main Entity
- `User (Admin)`
- `Category`
- `Product`

### 🔹 Relationship
- **Category (1) → (N) Product**
- Each Product belongs to a Category

---
## 👨‍💼 System Functions

### 🔐 Admin (login required)

- Manage Categories (CRUD)

- Manage Products (CRUD)

- Add products with:

- Name

- Description

- Price

- Inventory Quantity

- Category

### 🌐 Customer (no login required)

- View all products
- Filter by category
- Search by name
- View product details

---
## 💾 Data Storage

### Phase 1

- Save data using **Serialization (File I/O)**

### Phase 2

- Transfer to **Database (MySQL/PostgreSQL)**
- Use JDBC to manipulate data
- Design tables:

- `users`

- `categories`

- `products` (category_id foreign key)

---

## 🧵 Multithreading
- Simulates multiple Admins updating product stock simultaneously
- Handles **Race Condition**
- Uses `synchronized` to ensure data security

---
## 🔍 Advanced Features (Optional)
- Sort products by price / name
- Displays "Out of Stock" status
- Simple shopping cart (in-memory)
- Exports data to CSV file

- Pagination (LIMIT / OFFSET in SQL)

---
## 🚀 How to run the project

### 1. Clone project
```bash
git clone https://github.com/Hy2k4/Ecommerce.git
cd Ecommerce
