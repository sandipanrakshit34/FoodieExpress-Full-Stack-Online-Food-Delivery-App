# 🍽️ FoodieExpress: Full-Stack Online Food Delivery App

A sleek, responsive **online food ordering system** built with **React.js** and **Spring Boot**. Inspired by top platforms like Zomato and Swiggy, it enables seamless food browsing, cart management, UPI payments, and real-time order tracking.

---

## 📌 Table of Contents

- [🧠 About the Project](#-about-the-project)
- [💡 Problem Statement](#-problem-statement)
- [✅ Features](#-features)
- [🛠️ Technologies Used](#-technologies-used)
- [🚀 Setup Instructions](#-setup-instructions)
- [📸 Screenshots](#-screenshots)
- [✨ Unique Points](#-unique-points)
- [📬 Contact](#-contact)

---

## 🧠 About the Project

**FoodieExpress** allows users to:
- Browse food items by category
- Add food to cart and pay online via Razorpay
- Admin can manage food items and customer orders
- Customers can track their order status in real time

---

## 💡 Problem Statement

Food delivery apps often involve complex integrations. This project aims to:
- Simplify the end-to-end food delivery experience
- Integrate payment, media, and email services
- Provide real-time order tracking for customers and admin

---

## ✅ Features

### 🔐 User Authentication

- Register/Login using email and password
- User sessions maintained securely

### 🛒 Customer Side

- Browse food by category and name
- View food image, description, and price
- Add items to cart and place order
- Checkout with billing details
- Make payments via Razorpay (test mode)
- Track order status: Preparing → Out for Delivery → Delivered

### 🧑‍💼 Admin Panel

- Add/Edit/Delete food items with media
- View all orders placed by customers
- View and update order statuses
- Access customer info for deliveries

### ✉️ Email Notification

- Order confirmation email via Gmail API

---

## 🛠️ Technologies Used

### 🔹 Frontend:
- React.js
- HTML, CSS, JavaScript

### 🔹 Backend:
- Spring Boot (Java)
- REST APIs

### 🔹 Database:
- MongoDB

### 🔹 Payment:
- Razorpay (test integration)

### 🔹 Media & File Handling:
- AWS (for image uploads)

### 🔹 Email:
- Gmail API

---

## 🚀 Setup Instructions

### 🔧 Backend Setup (Spring Boot)

1. Clone the repository and import backend into your IDE (IntelliJ or Eclipse)
2. Configure `application.properties` with your MongoDB, AWS, and Gmail API credentials
3. Run the application using:
   ```bash
   ./mvnw spring-boot:run
   ```

### 💻 Frontend Setup (React)

```bash
git clone https://github.com/your-username/foodie-express.git
cd foodie-express/frontend
npm install
npm start
```

Your app will run on `http://localhost:3000/` by default.

---

## 📸 Screenshots

| Home Page | Cart Page | Admin Panel |
|-----------|-----------|-------------|
| ![](Assets/home.png) | ![](Assets/cart.png) | ![](Assets/admin.png) |

---

## ✨ Unique Points

- Inspired by Zomato and Swiggy interfaces
- Secure Razorpay payment integration
- Email alerts with Gmail API
- Real-time order status updates
- Admin panel to manage orders and inventory

---

## 📬 Contact

For queries or support:

📧 Email: yourname@example.com  
🌐 GitHub: [your-github-profile](https://github.com/your-username)
