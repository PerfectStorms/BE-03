# Introduction to the Class Date, LocalDate, Calendar and different formatters.

## Homework

### 1. Waiting for the new year.

Count and log all remaining days to the end of the current year.
Output example (if we started since 28 December):

> December 28
> December 29
> December 30
> December 31
>
> Remaining 4 days!

see **LocalDate plusDays(long daysToAdd)...**


### 2. The days of the week.

Your task - calculate the days of the week at the end of each month of the specified year.

For example:

```java
Map<Month, DayOfWeek> days = getDaysAtEndOfEachMonthFromYear(1945);
System.out.println(days);
```

Output:
>last days in 1945 = {JANUARY=THURSDAY, FEBRUARY=THURSDAY, MARCH=SUNDAY, APRIL=TUESDAY, MAY=FRIDAY, JUNE=SUNDAY, JULY=WEDNESDAY, 
>AUGUST=SATURDAY, SEPTEMBER=MONDAY, OCTOBER=THURSDAY, NOVEMBER=SATURDAY, DECEMBER=TUESDAY}

see **TemporalAdjusters.firstDayOfNextMonth()**


### 3. Friday 13.*

Implement a method that takes 2 different years as input. This method should select the year with the most Fridays 13.

Exapmle:
```java
int year = getJasonVoorheesDay(1900, 2020);
System.out.println("The most bloodiest year = " + year);
```

*good luck!*
