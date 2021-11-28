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