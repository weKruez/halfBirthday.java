/*could not convert day into double for accurate algorithm. leap year is -183, common year is -182.5* So rounded to all dates 183.*/

import java.time.*;
import java.util.*;

public class halfBirthday{
    
   public static void main(String [] args){
        
        int currYear;
        int month;
        int day;
       
       
       
        Scanner in = new Scanner (System.in);
        
        System.out.println("Enter the year your birthday will fall on, followed by month, and day of your birthday: ex. '2018', '01, '01'");
        
        currYear = in.nextInt();
        month = in.nextInt();
        day = in.nextInt();
        
        LocalDate birth = LocalDate.of(currYear, month, day);
        
        System.out.println("Your birthday is " + birth + ".");
       
        LocalDate now = LocalDate.now();
       
        System.out.println("Today is " + now + ".");
       

           System.out.println("Your half birthday is " + birth.minusDays(183) + ".");
           System.out.println("Your half birthday is " + Period.between(birth.minusDays(183), now) + ".");
    }
    
}
