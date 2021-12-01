# fest-countdown
#### Hello everyone! Are you interested in holidays? so am I. In this repo you can find some holiday countdown programs made with java. This programs can calculate the months and days for the following holidays.
- Christmas
- New year
- Halloween

## How to?
Go to the `releases` of this repo and `download` it or copy the codes, go to a online `java-compiler` and paste it and run.
#### Codes are below 👇
### Christmas ❄️
```java
import java.time.LocalDate;// importing LocalDate class
import java.time.Month;// importing Month class
import java.time.Period;// importing Period class
import java.time.temporal.ChronoUnit;// importing ChronoUnit class
 
 
public class aaa {
  public static void main(String[] args) {
       
      LocalDate today = LocalDate.now();//getting current date 
      
      LocalDate ChristmasDay = LocalDate.of(2020, Month.DECEMBER, 25);// setting Christmass day 
 
      LocalDate nextXmas = ChristmasDay.withYear(today.getYear());// Next year Christmas 
 
      //Add 1 if Christmas has past this year  
      if (nextXmas.isBefore(today) || nextXmas.isEqual(today)) {
          nextXmas = nextXmas.plusYears(1);
      }
 
      Period p = Period.between(today, nextXmas);
      long p2 = ChronoUnit.DAYS.between(today, nextXmas);// nanoseconds in days till Christmas 
      System.out.println("There are " + p.getMonths() + " months, and " +
                         p.getDays() + " days until Christmas! (" +
                         p2 + " total)");
  }
}
```
### New year 🎆
```java
import java.time.LocalDate;// importing LocalDate class
import java.time.Month;// importing Month class
import java.time.Period;// importing Period class
import java.time.temporal.ChronoUnit;// importing ChronoUnit class
 
 
public class aaa {
  public static void main(String[] args) {
       
      LocalDate today = LocalDate.now();//getting current date 
      
      LocalDate ChristmasDay = LocalDate.of(2020, Month.JANUARY, 01);// setting Christmass day 
 
      LocalDate nextXmas = ChristmasDay.withYear(today.getYear());// Next year Christmas 
 
      //Add 1 if Christmas has past this year  
      if (nextXmas.isBefore(today) || nextXmas.isEqual(today)) {
          nextXmas = nextXmas.plusYears(1);
      }
 
      Period p = Period.between(today, nextXmas);
      long p2 = ChronoUnit.DAYS.between(today, nextXmas);// nanoseconds in days till Christmas 
      System.out.println("There are " + p.getMonths() + " months, and " +
                         p.getDays() + " days until New year! (" +
                         p2 + " total)");
  }
}
```
### Halloween 🍬
```java
import java.time.LocalDate;// importing LocalDate class
import java.time.Month;// importing Month class
import java.time.Period;// importing Period class
import java.time.temporal.ChronoUnit;// importing ChronoUnit class
 
 
public class aaa {
  public static void main(String[] args) {
       
      LocalDate today = LocalDate.now();//getting current date 
      
      LocalDate ChristmasDay = LocalDate.of(2020, Month.OCTOBER, 31);// setting Christmass day 
 
      LocalDate nextXmas = ChristmasDay.withYear(today.getYear());// Next year Christmas 
 
      //Add 1 if Christmas has past this year  
      if (nextXmas.isBefore(today) || nextXmas.isEqual(today)) {
          nextXmas = nextXmas.plusYears(1);
      }
 
      Period p = Period.between(today, nextXmas);
      long p2 = ChronoUnit.DAYS.between(today, nextXmas);// nanoseconds in days till Christmas 
      System.out.println("There are " + p.getMonths() + " months, and " +
                         p.getDays() + " days until Halloween! (" +
                         p2 + " total)");
  }
}
```
> ### Don't forget to give a star... 🌟
