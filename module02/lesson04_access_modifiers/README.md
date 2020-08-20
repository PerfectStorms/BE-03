# Introduction to Access modifiers and variable types.

## Homework

### 1. Access the variables.
Create a class with private variables. Provide access to these variables from another class.

### 2. Count the instances.
Create a class. In the main method create several instances of your class. Count 
a quantity of your instances.

### 3. Change variables.
Create a class Lion with variable "name". Change the value of "name" by creating a special method (exclude the setter). 

### 4. Give the answer without using JVM.
What would be displayed in the console?
```java
class B {
    static int j = 5;
    
    static void abc(int i) {
        System.out.println(i);
    }

    public static void main(String[] args){
        abc(j++);
        System.out.println(j);
    }
}
```

### 5. Give the answer without using JVM.
What would be displayed in the console?
```java
class D {
    int x = 10;
    int a = 5;
    int b = 6;
    int c = 4;
        
    public double average() {
        if (x > 0) {
            double avg = 0;
            avg = (double) (a + b + c) / 3;
            return avg;
        } else {
            avg = 0;
            return avg;
        }

    }   
}
```


### 6. Give the answer without using JVM.
What would be displayed in the console?
```java
class A {
    public A() {
        str1 = abc("String1");
    }
    static String str1 = abc("String2");
    String str3 = abc("String3");
    {
        str1 = abc("String4");
    }
    static {
        str1 = abc("String5");
    }
    
    static String str2 = abc("String6");
    String str4 = abc("String7");
    
    public static void main(String[] args){
      A a = new A();
    }
    
    static String abc(String str) {
        System.out.println(str);
        return str;
    }       
}
```




