# Inner classes. Nested inner, Nester static, Local inner & Anonymous inner classes.

## Homework

### 1. Wake up Neo.
You have a class Programmer. The structure of working with this class is as follows:
```java
Programmer programmer = new Programmer("Tomas", 32);
Programmer.Stack stack = new Programmer.Stack(new String[]{"Java", "Spring", "Kotlin", "Postgresql", "Conspiracy theory"});

System.out.println(programmer.analysis(stack));
```

After you write this, the console will display:
> In the matrix there is a new programmer named **Tomas**, he is **32** years old. <br>
> Approximate work experience - **6** years. <br>
> Threat level: Serious, establish surveillance!

where Programmer is the base class with **name**, **age** and **Experience** fields, <br>
Experience - private nested class with field **summary**, calculated by the formula: <br>

> (age - 20) / 2

and can not be less than 0. Experience constructor is called internally Programmer constructor:
```java
public Programmer(String name, int age) {
    // some code
    experience = new Experience();
} 
```

Stack - public static nested class with String array **skills** field. <br>
And **analysis()** method should return the values indicated below for our programmer's current stack.

<p>
0 - Is absent <br>
1 - 4. Weak <br>
5 - 8 : Serious, establish surveillance! <br>
9 - 12 : Dangerous, send Smith to him! <br>
13 and more : He is the chosen one... <br>
</p>
