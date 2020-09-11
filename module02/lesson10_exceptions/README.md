# Exceptional situations. Hierarchy of exceptions.

## Homework

### 1.

Code given. What code is enough to add to the inc () method instead of a comment 
so that the compilation goes without errors? (choose 2).
```java
class Quest1{
int counter;
java.io.OutputStream out; Quest1(){/* инициализация out */} float inc() {
try { counter++;
     out.write(counter); }
//комментарий
}}
```
Answers:
1) catch (java.io.OutputStreamException e){}; 2) catch (java.io.IOException e){};
3) catch (java.io.OutputException e){};
4) finally{};
5) return counter;
6) return;

### 2.

What value will be returned when calling meth (5)?
```java
class Quest2 {
public int meth(int x) {
    int y = 010; //1
    try { y += x; //2
if(x<=5) throw new Exception(); //3
    y++; } //4 
    catch(Exception e) { y--; } //5
return y; } //6
}
```
Answers:
1) 12;
2) 13;
3) 14;
4) 15;
5) compilation error: Inexecutable code on line 4.

### 3.

What value will be returned when calling meth(12) if an ArithmeticException is thrown when calling mexcept(int x)?
```java
class Quest3 {
int meth(int x) {
int count=0;
try { count += x;
      count += mexcept(count);
      count++;
 } catch(Exception e) {
--count; return count;
}
finally {
count += 3; return count;
} }
}
```
Answers:
1) 11;
2) 12;
3) 13;
4) 14;
5) compilation error due to missing return after block finally.

### 4.

Which of the following definitions of the show () method can legally be used
use instead of comment // CODE in class Quest4?
```java
class Base {
public void show(int i) {/realisation*/}
}
public class Quest4 extends Base{
//КОД
}
```
Answers:
1) void show (int i) throws Exception {/realisation*/}
2) void show (long i) throws IOException {/realisation*/}
3) void show (short i) {/realisation*/}
4) public void show (int i) throws IOException {/realisation*/}

### 5.

Code given. Which declaration of the ioRead () method should be used instead of a comment
to successfully compile and execute the code?
```java
 public class Quest5 {
public static void main(String[] args) {
 try {
ioRead();
} catch(IOException e) {}
}}
```
Answers:
1) private static void ioRead() throws IOException { };
2) public static void ioRead() throw IOException { };
3) public static void ioRead() { };
4) public static void ioRead() throws Exception { };