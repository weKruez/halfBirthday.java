/*could not convert day into double for accurate algorithm. leap year is -183, common year is -182.5* So rounded to all dates 183. Common years not taken into account. Slight errors. */

import java.time.*;
import java.util.*;

public class halfBirthday{
    
   public static void main(String [] args){
        
        int currYear; //int of current year of birthday ex '2001' for LocalDate birth line 24
        int month; // int month of birthday ex '01' for LocalDate birth line 24
        int day; // int day of birthday ex '01' for LocalDate birth line 24
       
       
        Scanner in = new Scanner (System.in); //scanner in
        
        System.out.println("Enter the year your birthday will fall on, followed by month, and day of your birthday: ex. '2018', '01, '01'"); //user prompt
        
        currYear = in.nextInt(); //user input for year
        month = in.nextInt(); //user input for month
        day = in.nextInt(); //user input for day
        
        LocalDate birth = LocalDate.of(currYear, month, day); //LocalDate of Birthday
        
        System.out.println("Your birthday is " + birth + "."); //output for birthday
       
        LocalDate now = LocalDate.now(); //Today's date for reference.
       
        System.out.println("Today is " + now + "."); //out for today's date
       

           System.out.println("Your half birthday is " + birth.minusDays(183) + "."); //half birthday with algorithm for 183 days
           System.out.println("Your half birthday is " + Period.between(birth.minusDays(183), now) + "."); //months and days until halfbirthday
    }
    
}
