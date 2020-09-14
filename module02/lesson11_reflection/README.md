# Class and Reflection.

## Homework

### 1.

Create class Person with fields:
name, age and company (fields must be private), add setter and getter, write as in the example:

 ```java
public class Person {

    private String name;
    private int age;
    private String company;

    public void setName(String name) {
        ...
    }
    
    //setter for the age field must be absent
    
    public void setCompany(String company) {
        ...
    }
    
    public int getAge() {
        ...
    }
    
    //getter for the name field must be absent
        
    private String getCompany() { //private method
        ...
    }
    
} 
```
### 2.

Add the main method.</br>
Create an object of the Person class, assign values to the fields through setters.</br>
* Using Reflection, set the value of the age field.
* Using Reflection, get the value of the name field.
* Using Reflection, call the private method getCompany using Reflection
* Display all fields on the screen.

### 3.
* Display all fields on the screen.
* Display all PUBLIC methods of the Person class.
* Display all methods of the Person class.

### 4.

Instantiate the Person class using Reflection.</br>
Add a constructor to the Person class that initializes the fields.</br>
```java
public Person(int age, String name, String company) {
    this.age = age;
    this.name = name;
    this.company = company;
}
```
Comment out the code to create the object above.This code won't work anymore.</br>
Now create a new object using Reflection.

### 5.

Implement multiple interfaces, using Reflection display this list.
Using Reflection:
* Check if your class is an interface.
* Check if your class is an public.
* Check if your class is an static.</br>
Display result.

Questions:
* What is Class class for?
* What entities in java have a Class?
* What are the ways to get a object Class?
* How to get the Class from an object?
* What is Reflection used for?
* What are the disadvantages of Reflection?
