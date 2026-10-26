# Hospital Medical Billing System

## Description

This is a Java assignment designed to calculate the total costs of different medical services in a hospital. In this project, I used Object-Oriented Programming (OOP) concepts such as Encapsulation, Inheritance, Polymorphism, and Abstraction.

- **Encapsulation:** I used `private` fields and getter and setter methods to access and update the values of the attributes.
- **Inheritance:** I created an abstract parent class called `MedicalService` and three subclasses: `Consultation`, `LaboratoryTest`, and `Ultrasound`. The subclasses inherit common attributes and methods from the parent class.
- **Abstraction:** I declared the `MedicalService` class as `abstract` and created an abstract method called `calculateTotalcost()` that each subclass must implement.
- **Polymorphism:** I used the `calculateTotalcost()` method in the different subclasses, where each class provides its own implementation to calculate the total cost of its medical service.

## Answers to the Questions

### 1. Why is the `MedicalService` class declared as abstract?

The `MedicalService` class is declared as abstract because it represents a general medical service. It provides common attributes and methods for its subclasses, while requiring each subclass to implement the `calculateTotalcost()` method and that you can not create an object for it  directly.

### 2. What is the purpose of the abstract method `calculateTotalcost()`?

The purpose of this abstract method is to ensure that every subclass provides its own implementation for calculating the total cost of a medical service.

### 3. How does inheritance help reduce code duplication?

Inheritance reduces code duplication because common attributes and methods are defined in the parent class. The subclasses inherit these features instead of declaring them again.

### 4. How does polymorphism work in this program?

Polymorphism allows the same method, `calculateTotalcost()`, to behave differently depending on the type of medical service. For example, consultation, laboratory tests, and ultrasound services can each calculate their total costs differently.

