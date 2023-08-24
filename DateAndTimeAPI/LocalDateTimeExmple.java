/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jigyasa_yadav
 */
public class LocalDateTimeExmple {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("the date and time is " + dt);
        System.out.println("the day of the month is " + dt.getDayOfMonth());
        System.out.println("the day of the year is " + dt.getDayOfYear());
        System.out.println(dt.getNano());
        System.out.println("the Day is " + dt.getDayOfWeek());
        System.out.println("the date is " + dt.toLocalDate());
        System.out.println("the time is " + dt.toLocalTime());
        System.out.println("output will get replace the hour as the input given in the argumnet "+ dt.withHour(4));
        //formatter used 
        System.out.println(""+dt.format(DateTimeFormatter.ISO_DATE));
        
        
        //of operator 
          LocalDate date
            = LocalDate.of(2020, 5, 13);
  
        // Create LocalTime object
        // using LocalTime.of() method
        LocalTime time = LocalTime.of(6, 30);
  
        // Create LocalDateTime object
        LocalDateTime localdatetime
            = LocalDateTime.of(date, time);
  
        // Print full date and time
        System.out.println(
            "DateTime: " + localdatetime);
   
    }

}
