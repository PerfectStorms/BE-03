# Introduction to Classes

## Homework

### 1. Create Person

Create a simple class *Person* with fields *name* and *age*. Add constructor. <br>
Call an instance of Person class like this:
```java
Person person = new Person("Sam", 33);
```


### 2. Improve Person
Create class Person from task 1. Override *toString()* method.
> If you are using an Intellij Idea, then press the key combination Insert + Alt (Generate),
 and select *toString*.
>
Add a method *meditaion()* for Person class. When called *meditaion()*, it will display a line 
with the inscription "I think - it means I exist.", the name of the person and the current date.
Example:

>##### If write on Test class:
>
>Person deckardCain = new Person("Deckard Cain", 68);<br>
>deckardCain.meditation();
>
>##### You should output:
>
>I think - it means I exist. (Deckart Cain)	Tue Aug 11 11:11:11 MSK 2020


### 3. Cat-Person relationships

Create class "Cat" that has a structure: String name, int age, Breed breed (Enum) and Person owner.<br>
Enum declared example: (you can substitute other values)
```java
public enum Breed {
    SIAMESE,
    NEBELUNG,
    BIRMAN;
}
```
The print output to which we will transfer the Cat object should look like this:
> Cat{name='Murzik', age=5, breed=NEBELUNG, owner=Person{name='Stepan', age=30}}


### 4. Sort Person array        `*hard`
On Test class Create an Person array of 6 elements.
Fill it with people with different fields (age & name).<br>
Create 2 sorting methods, where *sortByName()* - sorts by name, and *sortByAge()* - sorts by age, respectively.

> ##### Code:
>
> sortByAge(people);<br>
> System.out.println("After sorting by age:");<br>
> System.out.println(Arrays.toString(people));<br>
><br>
> sortByName(people);<br>
> System.out.println("After sorting by name:");<br>
> System.out.println(Arrays.toString(people));<br>
>
> ##### Output:
>
> After sorting by age:<br>
> [Person{name='Van Helsing', age=17}, Person{name='Altair', age=25}, Person{name='Deckart Cain', age=33},
> Person{name='Sam', age=36}, Person{name='Gannibal', age=85}]<br>
> After sorting by name:<br>
> [Person{name='Altair', age=25}, Person{name='Deckart Cain', age=33}, Person{name='Gannibal', age=85},
> Person{name='Sam', age=36}, Person{name='Van Helsing', age=17}]
