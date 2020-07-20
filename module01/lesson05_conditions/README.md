# Introduction to conditional statements

## Homework

### 1. Task with "if" statement
What will be displayed on the console as a result?
```java
int a = 7;
int b = --a;

if (b == 7) {
   System.out.println("b = 7");
}
```

### 2. Task with "if - else" statement
What will be displayed on the console as a result?
```java
int c = 3, d = 2;

if (c = d++) {
    System.out.println("It is 'if' statement!");
} else {
    System.out.println("It is 'else' statement!");
}
```

### 3. Task with "if - else if" statement
There are 3 numbers: 34, 2, 78 (type int). Compare them using "if - else -if" statement. 
Find the maximum and find the minimum.

### 4. Task with "nested if" statement
What will be displayed on the console as a result?
Correct only one symbol to change existing output to other outputs.
```java
int a = 10;
int c = a;
int b = ++a;
    if (b >= a){
        if (c == 10){
            if ((c <= b) && (a != b)){
                System.out.println("All statements are true."); 
            } else {
                System.out.println("One of the statements isn't true."); 
            }
        } else {
            System.out.println("One of statements is true."); 
        }
    } else {
        System.out.println("All statements are false"); 
    }
```

### 5. Task with ternary operator
Replace "if-else" construction to ternary operator.
```java
int num = 8;
String message = "";
if(num > 10) {
    message = "Number is greater than 10";
} else {
    message = "Number is less than or equal to 10";
}
```

### 6. Task with "switch - case" statement
There is the number of month (type int). 
You need to determine the season of year (winter, spring,
summer, autumn) and display on the console. 

### 7. Task with "switch - case" statement
Fix the code to get correct console output.
```java
 String day = "wednesday"; // it can be any day
        switch(day) {
            case "monday":
                System.out.println("This is the first day of the week");
            case "tuesday":
                System.out.println("This is the second day of the week");
            case "wednesday":
                System.out.println("This is the third day of the week");
            case "thursday":
                System.out.println("This is the fourth day of the week");
            case "friday":
                System.out.println("This is the fifth day of the week");
            case "saturday":
                System.out.println("This is the sixth day of the week");
            case "sunday":
                System.out.println("This is the seventh day of the week");
            default:
                System.out.println("Such day of the week doesn't exist.");
        }
```
