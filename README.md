🌱 Spring Database Connectivity (Java + Spring + MySQL)

A fully documented, Maven-based Spring application demonstrating database integration using **Spring Core**, **Spring JDBC**, and **MySQL**.
This repository is designed for learning, interviews, and real-world Java backend development.

---

## 📌 Table of Contents

* [🚀 Overview](#-overview)
* [✨ Features](#-features)
* [📂 Project Structure](#-project-structure)
* [🛠️ Technologies Used](#️-technologies-used)
* [📦 Dependencies](#-dependencies)
* [⚙️ Database Setup](#️-database-setup)
* [🔧 Configuration](#-configuration)
* [▶️ Running the Project](#️-running-the-project)
* [📘 CRUD Operation Examples](#-crud-operation-examples)
* [🧱 Architecture Diagram](#-architecture-diagram)
* [📸 Screenshots](#-screenshots)
* [🧪 Testing](#-testing)
* [🚀 Future Enhancements](#-future-enhancements)
* [🤝 Contributing](#-contributing)
* [📄 License](#-license)

---

## 🚀 Overview

This project demonstrates **how to connect a Java application to a MySQL database using the Spring Framework** without Spring Boot.
It uses Spring’s **IoC container**, **JdbcTemplate**, and **XML-based configuration** to perform CRUD operations.

Perfect for:

* Java backend beginners
* Interview preparation
* Understanding Spring Core concepts
* Real-world Java + DB integration

---

## ✨ Features

✔ Spring IoC container
✔ XML-based configuration
✔ MySQL database connectivity
✔ CRUD operations using JdbcTemplate
✔ Clean Maven structure
✔ Lightweight, fast, and beginner-friendly

---

## 📂 Project Structure

```
SpringDataBaseConnectivity/
│── src/
│   ├── main/java/
│   │   └── com.sample.client/
│   │   └── com.sample.dao/
│   │   └── com.sample.dao.impl/
│   │   └── com.sample.demo.model/
│   │   └── com.sample.service/
│   │   └── com.sample.service.impl/
│   ├── main/resources/
│   │   └── applicationContext.xml
│   └── test/java/
│
│── pom.xml
│── .project
│── .classpath
│── README.md
```

---

## 🛠️ Technologies Used

* **Java 8+**
* **Spring Core 6**
* **Spring JDBC 5.3**
* **MySQL Connector/J**
* **Maven**
* **Eclipse / IntelliJ**

---

## 📦 Dependencies (from `pom.xml`)

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.0.8</version>
</dependency>

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.30</version>
</dependency>

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.3.23</version>
</dependency>
```

---

## ⚙️ Database Setup

### 1. Create Database

### 2. Create Table
---

## 🔧 Configuration

### **`applicationContext.xml`**

```xml
<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
    <property name="driverClassName" value="com.mysql.cj.jdbc.Driver" />
    <property name="url" value="jdbc:mysql://localhost:3306/spring_demo" />
    <property name="username" value="root" />
    <property name="password" value="your_password" />
</bean>

<bean id="jdbcTemplate" class="org.springframework.jdbc.core.JdbcTemplate">
    <property name="dataSource" ref="dataSource"/>
</bean>
```

---

## ▶️ Running the Project

### Steps:

1. Clone the repository
2. Open in **Eclipse** or **IntelliJ**
3. Run `mvn clean install`
4. Right-click → `Run As → Java Application`
5. Spring loads configuration and connects to MySQL

---

## 📘 CRUD Operation Examples

### ➕ Insert Record

```java
String sql = "INSERT INTO users(name, email) VALUES (?, ?)";
jdbcTemplate.update(sql, "John Doe", "john@gmail.com");
```

### 📌 Fetch All Records

```java
List<User> list = jdbcTemplate.query("SELECT * FROM users", new UserRowMapper());
```

### ✏️ Update Record

```java
String sql = "UPDATE users SET email=? WHERE id=?";
jdbcTemplate.update(sql, "new@gmail.com", 1);
```

### ❌ Delete Record

```java
jdbcTemplate.update("DELETE FROM users WHERE id=?", 2);
```

---

## 🧱 Architecture Diagram

```
                 +------------------------+
                 |      Presentation      |
                 |      (Main Class)      |
                 +------------+-----------+
                              |
                              v
                 +------------------------+
                 |    Spring Container    |
                 |  (applicationContext)  |
                 +------------+-----------+
                              |
                              v
                  +----------------------+
                  |     DAO Layer        |
                  |  (JdbcTemplate Ops)  |
                  +-----------+----------+
                              |
                              v
                    +------------------+
                    |    MySQL DB      |
                    +------------------+
```

---

## 🧪 Testing

You can write JUnit 5 test cases under:

```
src/test/java/
```

Example test:

```java
@Test
void testFetchUsers() {
    assertFalse(userDao.getAllUsers().isEmpty());
}
```

---

## 🚀 Future Enhancements

📌 Add REST API using Spring MVC
📌 Replace XML with Java Config
📌 Add Hibernate/JPA support
📌 Add user interface (JSP/Thymeleaf)
📌 Containerize using Docker

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a new branch
3. Commit changes
4. Open a pull request

---

## 📄 License

This project is licensed under the **MIT License**.
You are free to use, modify, and distribute.

---
