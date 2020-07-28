# Introduction to Operators

## Homework

### 1. Math operators:
  Create variables and assign values ​​where:   
  * a is the sum of 10 and 2
  * b is the sum of a and 5
  * c - subtract a from b, add 1 to the result
  * d - multiply a, b and c
  * e - divide d by 8
  * f - get the remainder from dividing e by 30
  * i - change the sign of the variable f
  * Display all variables.
    
    An example of the class name for this assignment is presented below:   
```java
public class ProgramTask41 {
   public static void main(String[] args) {
      int a = ...
      int b = ...
      ...
   }
}
```  
### 2. Assignment operators: 
  Create a variable a and assign it the value 10, then use the following operators to change the value of the variable:
  "+="   "-="   "*="   "/="   "%="
  
      An example of the class name for this assignment is presented below:   
```java
public class ProgramTask42 {
   public static void main(String[] args) {
      int a = 10;
      ...
   }
}
``` 
  * Add 3
  * Subtract 7
  * Multiply by 4
  * Divide by 8
  * Get the remainder of division by 2.
  * After each operation, display the variable a on the screen.
  
### 3. Increment and decrement operators:
  Create variable a and b. Set the variable a to 0,
  b value 5.
  Then:
  * Using the increment operator, increase the variable a.
  * Using the decrement operator, decrease the variable b.
  * Display the variables on the screen.
  * Assign the following expression to variable a:
  ```java
   a = --b;
  ```  
   
  and display the variables on the screen.
  * Assign the following expression to variable a:
  ```java
   a = b--;
  ```  
  and display a and b on the screen.
  Write in the comments what happened, why?
  Write what pre-increment and post-increment are, as well as pre-decrement and post-decrement.
    
  An example of the class name for this assignment is presented below:   
  ```java
  public class ProgramTask43 {
     public static void main(String[] args) {
        int a = 0;
        int b = 5;
      ...
   }
}
```

### 4. Comparison operators:
  Create variables a and b. Set the variable a = 3,
    b = 5.
  Display the result of each comparison operator.
  >   <   >=   <=   ==   !=
  ```java
  public class ProgramTask44 {
     public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println (a > b);
     }
  } 
  ```
  Set the value of the variable a = 5,
  display the results on the screen.
  Write in the comments what has changed, why?
  What data type does the comparison operator return?
  Write the result of the work 
  ```java
  a != b
  ```
  into a variable and display it on the screen.
  
  
  
  

### 5. Logical operators:
   Create boolean variables bOne and bTwo. Set the values, bOne is true, bTwo is false. Display the result of all logical operations on the screen.
   
   &&   ||   !   ^
   
   &    |    !   ^ 
   
   Change bTwo to true. Display the result again.
   What type do logical operators return?
   What is the difference between the logical operator NOT (!) And the rest?
   What's the difference between shorthand and regular boolean operators? (Write in the comments)
   Is the following example valid? If so, what would be the result:
   ```java
   a. true || false
   b. false && true
   c. !true || 1 >= 0
   d. false && 5
   e. true &&! false
   f. true ^! true
   i. 1> = 1 || false
   g. true && 5 - 5
   ```
    
    An example of the class name for this assignment is presented below:   
```java
public class ProgramTask45 {
   public static void main(String[] args) {
      // Write down here the answer to the question.
   }
}
```    
### 6. Bitwise operators:
   Create two variables as in the example.
   int a = 4;
   int b = 3;
     
    &   |   ~   ^
    
   Apply and display the output of the bitwise operators using the variables a and b.
   What are bitwise operators like?
   How the number will change after applying the NOT operator (~).
    
    An example of the class name for this assignment is presented below:   
  ```java
  public class ProgramTask46 {
     public static void main(String[] args) {
        int a = 4;
        int b = ... // 3 in binary;
     }
  }
  ```
### 7. Bit Shift operators:
   Create a variable a = 10
   
    <<   >>   >>>
   
   Using the bitwise left shift operator double the number (Spoiler alert: The result should be 20).
   Display the result on the screen.
   Using the bitwise right shift operator divide the number by 4. (Spoiler alert: the result should be 5)
   Now set the variable to a value (-5).
   Use the unsigned bitwise shift a right operator by 1. Print the result. Why did the number become large and positive?
   What is the difference between the operator (>>>) and (>>)?
   
    An example of the class name for this assignment is presented below:   
   ```java
    public class ProgramTask47 {
       public static void main(String[] args) {
          int a = 10;
       }
    }
    ``` 
    
