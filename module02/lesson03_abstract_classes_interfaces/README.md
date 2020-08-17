# Introduction to Abstract classes and interfaces

## Homework

### 1. Create abstract class Employee

Add name and age fields. Create a constructor.
Create methods to get fields (Getter methods)
Create a method speak(). The method should output: “Hi, my name is“ name ”. I'm "age" years old.
Also create a abstract method workInfo().

### 2. Create specific classes.
Create classes Doctor, Builder, Programmer. Create constructor with name, age arguments.
Add method heal() in class Doctor,  build() in class Builder, programming() in class Programmer.
Methods should display "Heals". Methods should display "Builds". Methods should display "Programming".
Inherit them from the abstract Employee class. Override the method workInfo() for each class.

### 3. Interface
Create an interface Intellectual with method think(). Methods should display "Thinks". And Strongman 
with  method drag(). Methods should display "Drags".
Implement the Intellectual interface in the Doctor and Programer classes.
Strongman interface in Builder class.

### 3. Practice
Create the Main class in a separate file.
Make any 3 instances of each specific class. Call their methods.

### 4. Questions.

Can an abstract class be instantiated?
Is it possible to define a constructor for an abstract class?
Can there be a non-abstract method in an abstract class?
Can there be abstract and non-abstract methods in an abstract class?
Can there be an abstract method in a non-abstract class?
Can a non-abstract method be overridden?
Are all methods of an interface abstract?
Is it possible to create an interface without a method?
What is the difference between an abstract class and an interface?

