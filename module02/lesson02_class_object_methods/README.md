# Introduction to Class Object methods

## Homework

### 1. Create cats and use toString() method

Create a simple class *Cat* with fields *name*, *age* and *breed*. Add constructor, override *toString()* method for Cat class. <br>
Then create a class Main and make 3 any instances of Cat class.
Print *name*, *age* and *breed* of each of its instances.

### 2. Use hashCode() method

Сreate a simple class *Human* with one field *name*. Add constructor and 
set your algorithm for determining the hash code of the object by overriding *hashCode()* method. <br>
Then create a class Main and make 1 any instance of Human class.
Print the hash code of your instance.

### 3. Use equals() method

The equals method compares two objects for equality.
Create a simple class *Dog* with fields *name*. Add constructor, override *equals()* method. <br>
Then create a class Main and make any instances of Dog class so that when comparing two instances, 
false is printed to the console, and true is printed when comparing others.

### 4. Task for garbage collector

How many items will be scrapped after line 7?
```java
public class TutorialGC
  {
    public static void main(String [] args)
    {
      Object a = new Integer(100);  // Line1
      Object b = new Long(100);     // Line2
      Object c = new String("100"); // Line3
      a = null;                     // Line4
      a = c;                        // Line5
      c = b;                        // Line6
      b = a;                        // Line7
      // Rest of the code here
    }
  }
```

