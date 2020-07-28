# Introduction to one/two dimensional arrays

## Homework

### Task 1
Сreate an array and fill it with numbers from 1 to 10.

*Simple way to output an array to the console is a Arrays.toString(array):* 
```java
int[] array = ...
System.out.println(Arrays.toString[array]);
```

### Task 2
Сreate an array and fill it with numbers from 1 to 10. 
Create a new array and fill it with the values from the previous array in reverse order
```java
int[] array = ...
int[] reverse = ...
```

### Task 3
Implement a method that swaps the elements of the passed array. 
The method takes 2 arguments (array indices) and returns nothing (void).
```java
public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    swap(array, 0, 1);
    
    int[] array2 = new int[]{2, 3, 4, 5, 6, 10};
    swap(array2, 2, 5);
}

private static void swap(int[] array, int indexA, int indexB) {
    System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);
  
    // todo...
         
    System.out.println("Result: " + Arrays.toString(array) + "\n");  
}
```
<em>The console should output:

Trying swap: [1, 2, 3, 4, 5] indices 0 and 1 <br>
Result: [2, 1, 3, 4, 5]

Trying swap: [2, 3, 4, 5, 6, 10] indices 2 and 5 <br>
Result: [2, 3, 10, 5, 6, 4] </em>


### Task 4
Implement a method that swaps the elements of the passed array from Task 3.
Handle cases of invalid input array indices.

```java
public static void main(String[] args) {
     int[] array = {1, 2, 3};
            swap(array, 1, 2);
            swap(array, 1, 3);
            swap(array, -1, 0);
    
            int[] array2 = new int[]{2, 4, 6, 8, 10};
            swap(array2, 2, 3);
            swap(array2, 4, 5);
            swap(array2, -2, 0);
}
```

<em>The console should output:

Trying swap: [1, 2, 3] indices 1 and 2 <br>
Result: [1, 3, 2]

Trying swap: [1, 3, 2] indices 1 and 3 <br>
IndexB (3) incorrect!

Trying swap: [1, 3, 2] indices -1 and 0 <br>
IndexA (-1) incorrect!

Trying swap: [2, 4, 6, 8, 10] indices 2 and 3 <br>
Result: [2, 4, 8, 6, 10]

Trying swap: [2, 4, 8, 6, 10] indices 4 and 5 <br>
IndexB (5) incorrect!

Trying swap: [2, 4, 8, 6, 10] indices -2 and 0 <br>
IndexA (-2) incorrect! </em>
