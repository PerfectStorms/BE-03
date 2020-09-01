# Introduction to Inheritance and Polymorphism

## Homework

Note:

Please create a separate file for each class.

### 1. Inheritance.

Create an abstract class Vehicle with fields: size and power. Add a constructor, and getters.</br>
```java
public abstract class Vehicle {

    private String brand;
    private String model;
    ...
} 
```
Also create abstract classes: </br>
* Сar with field - maxSpeed, </br>
* Truck with field - maxWeight, </br>
* Bus with field - numberSeats.</br>

```java
public abstract class Car ... {

   private int maxSpeed;

} 
```
Add a constructor, and getters.</br>
Create of two classes of each type.</br>
For example:
```java
public class MazdaSix ... {

} 
```
Think over the class hierarchy.

### 2. Polymorphism.

Create classes: .</br>
* MiniGarage - only for Car (one vahicle)</br>
* Garage - for Truck or Car (one vehicle)</br>
* BigGarage - for any type (two vehicle)</br>

A garage class object can add and remove a vehicle to itself.</br>
Example:

```java
public class MiniGarage {

  public boolean enter(...) {
    ....
  }

  public boolean leave() {
    ....
  }
}
```
Note:
An interface may be needed!


### 3. Practice.

  Create objects of different types of garages.</br>
  Create different vehicles.</br>
  Park them!</br>
  Then leave.</br>
  Try as many different options as possible.</br>
  
  Example:
  
```java
public static void main() {

   Garage garage = new Garage();
   garage.enter(new MersedesTruck(....)));
   garage.leave();
   ......
  
}
```

### 4. Questions.

* What is the parent class of all classes?
* How do I call the constructor of the parent class?
* Will the parent class constructor be called automatically?
* Will the parent class constructor be automatically called with arguments?
* Can interface type be used for polymorphism?</br>

There are the following classes:
```java
class A {

}

class B extends A {

}

class C extends B {

}
```

* Is it possible to do this?
```java
B b = new A();
```

* Is it possible to do this?
```java
B b = new B();
```

* Is it possible to do this?
```java
B b = new C();
```

* Is it possible to do this?
```java
Object obj = new A();
Object obj1 = new B();
Object obj2 = new C();
```



