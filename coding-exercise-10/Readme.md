# Handling Exceptions in Java: Advanced Exercise

## Try-Catch, Throw, and Throws in Action

Write a Java program that validates a user's age for access and throws a custom exception if the age is invalid.

---

## Tasks

### 1. Create a Custom Exception Class

Create a custom exception class named `InvalidAgeException` that:
* Extends `Exception`
* Has a constructor that accepts a message and passes it to `super(message)`

### 2. Create the `checkAge()` Method

Create a method named `checkAge(int age)` that:
* Throws `InvalidAgeException` if the age is less than 18
* Otherwise, prints `"Access granted"`

### 3. Implement the `main()` Method

In the `main()` method:
* Call `checkAge(16)` and `checkAge(21)`
* Use separate `try-catch` blocks for each call
* If an exception is caught, print:
```
  Exception caught: <message>
```

---

## Instructions

1. Use `throw` to raise an exception when the age is invalid
2. Use `throws` in the method signature to declare the exception
3. Catch the exception in `main()` and print the error message using `e.getMessage()`
4. Print `"Access granted"` only if no exception is thrown

---

## Expected Output
```
Exception caught: Age must be 18 or older
Access granted
```

---

## Getting Started

1. Create a new Java file named `AgeValidator.java`
2. Implement the custom exception class
3. Implement the `checkAge()` method
4. Write the `main()` method with try-catch blocks
5. Compile and run the program

---

## Key Concepts

- **Custom Exceptions**: Creating user-defined exception classes
- **throw**: Explicitly throwing an exception
- **throws**: Declaring exceptions in method signatures
- **try-catch**: Handling exceptions gracefully
- **Exception Messages**: Retrieving error details using `getMessage()`