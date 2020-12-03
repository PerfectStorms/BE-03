# Introduction to Serialization.

## Homework

### Task1
Create class Song with fields, constructor and getters.
```java
class Song {
  private String title;
  private double duration;
  private Author author;
}
```

### Task 2
Create class Author with fields, constructor and getters. Make the field uniqueNum noserialized.
```java
class Author {
  private String name;
  private int age;
  private String uniqueNum;
}
```

### Task 3
Create class Test with method main().
```java
class Test {
  public static void main(String args) {
  
  }
}
```
Serialize three object Song.

Run programm.

Comment out the serialization above.
Deserialize three object Song.


### Questions:

1. How do I make a field non-serializable?
2. Can static fields be serialized?
3. What methods does the Serializable interface have?
4. What methods does the Externalizable interface have?
5. What is the difference between Serializable and Externalizable interfaces?
6. If the parent implements the Serializable interface, then the child also implements?
