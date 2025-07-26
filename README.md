# SE-4111 Singleton Project

> 🏫 **Course:** Computer Architecture (SE-4111)  
> 👨‍🏫 **Instructor:** Dr. Mowal  
> 🧑‍🎓 **Students:** Mariam Alahmar, Hadeel Abdullah, Leena Abdullah  
> 📅 **University Project - Term Submission**

This Java project is a demonstration of the Singleton Design Pattern, developed as part of the SE-4111 coursework.

## 💡 Purpose

The goal is to simulate a Singleton instance that stores and reacts to personalized temperature values for three users: Mariam, Hadeel, and Leena. Each user has a custom rule to classify weather as "cold" or "hot".

## 📁 Project Structure

```
SE-4111/
├── com/
│   └── singleton/
│       ├── main.java               // Entry point
│       └── singletonClass.java     // Singleton logic
│
├── test/
│   └── com/
│       └── singleton/
│           └── UnitTest.java       // JUnit 5 tests
│
├── lib/
│   └── junit-platform-console-standalone-1.10.0.jar  // JUnit runner
│
├── .gitignore
└── README.md
```

## ▶ How to Run

### 1. Compile the program:

```bash
javac com/singleton/*.java
```

### 2. Run the program:

```bash
java com.singleton.main
```

The app will prompt you to enter temperatures for each user and respond accordingly.

## 🧪 Running Unit Tests (JUnit 5)

### 1. Compile the tests:

```bash
javac -cp "lib/junit-platform-console-standalone-1.10.0.jar" test/com/singleton/UnitTest.java
```

### 2. Run the tests:

```bash
java -jar lib/junit-platform-console-standalone-1.10.0.jar -cp . --scan-classpath
```

## ✅ Features

- Implements Singleton design pattern
- Personalized logic for three users
- Simple JUnit 5 test validation
- Fully runnable via terminal

## 🧠 Developed by

- Mariam Alahmar
- Hadeel Abdullah
- Leena Abdullah
