# Introduction to methods

## Homework

### 1. Parameters

- Write a method with no parameters that displays numbers from 1 to 20. Even on the right, odd on the left. Call it in the main method.

- Write a method with one parameter that will output the sum of numbers from 1 to the given parameter. Call it in the main method.

- Write a method with two parameters that will print all numbers from the first parameter to the second parameter, which are divisible by 3. Call it in the main method.

- Write a method with three parameters that will deduce whether such a triangle is possible.
  (Tip: For a triangle, the sum of any two sides must be greater than the third.)
  Call it in the main method.

### 2. Return Value
- Write a method with one parameter that will return true if the number is greater than zero, otherwise it will return false. In the main method, call it and display it. Experiment with different parameters.

- Write a method with one parameter that will call the method from the previous job and, if true, return the string: "number is greater than zero", otherwise the string "number is zero or less". In the main method, call it and display it. Experiment with different parameters.

- Write a method with one parameter that will call the method from the previous job and additionally return a number. Example (number is greater than zero and equal to 10)
  In the main method, call it and display it. Experiment with different parameters.

### 3. Method overloading
Write multiplication methods using overloading:
- With one integer parameter.
- With two integer parameters.
- With one double parameter and one integer parameter.
- With two double parameters.
- With an integer array.
  Call all of these methods in the main method.
  
Questions:
- What is method overloading?
- How to overload a method?

There is a method:
```java
   public static double sum(int a, double b) {
      ...
   }
```
Is this a method overload?
```java   
   public static void sum(int a, double b) {
      ...
   }  
```
And this?
```java   
   public static double sum(double a, int b) {
      ...
   }  
```

### Recursion.
- Write a method that takes an integer parameter and displays numbers from 0 to the parameter. Use recursion.
  Call it in the main method.
  
Questions: What does recursion compare to?
What error can the careless use of recursion cause?
