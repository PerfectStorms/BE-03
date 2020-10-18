# Introduction to Map interface

## Homework

### 1. Arm*strong* numbers

Arm*strong* number = a natural number, which in a given number system is equal to the sum of its digits raised to a 
power equal to the number of its digits. <br>
**S** consists of **M** digits, for example **S** = 370 and **M** (number of digits) = 3.
Implement the logic of the **getNumbers** method, which should be less than N (long) among natural numbers
find all numbers that meet the following criteria:
*the number S is equal to the sum of its digits raised to the M power*.<br>

*getNumbers* should return all such numbers in ascending order.<br<

An example of the required number:
>370 = 3 * 3 * 3 + 7 * 7 * 7 + 0 * 0 * 0
>
>8208 = 8 * 8 * 8 * 8 + 2 * 2 * 2 * 2 + 0 * 0 * 0 * 0 + 8 * 8 * 8 * 8

You can read more about the Arm*strong* numbers [here](https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%BE_%D0%90%D1%80%D0%BC%D1%81%D1%82%D1%80%D0%BE%D0%BD%D0%B3%D0%B0)

###### Requirements:
       1. The Solution class must have a public static long[] getNumbers (long N) method.
       2. The getNumbers method should not throw any exceptions for any input.
       3. All found numbers must be strictly less than N.
       4. The getNumbers method should return an array of numbers satisfying the condition of the problem.

Method:
```java
public static long[] getNumbers(long N) {
        long[] result = null;
        // TODO find all armstrong numbers
    }
```

Example output expected:

for: 
>long[] numbers = getNumbers(1000);<br>
>System.out.println(Arrays.toString(numbers))

output:
>1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407


### 2. Optimizing the Arm*strong* Number algorithm

If 1 step is completed, you have the opportunity to make Armstrong's algorithm more efficient.<br>
The algorithm works well for short distances, but is downright bad for big data.

Now the optimization requirements *(for any long number!)*: <br>
1. Speed limit - **10 seconds**
2. Memory limit - **50 megabyte**


Test your big data with:
```java
public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(100_000_000L)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 128 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }
```
