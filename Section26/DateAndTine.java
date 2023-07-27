/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section26;

/**
 *
 * @author jigyasa_yadav
 */
import java.util.*;
import java.time.*;
import java.lang.annotation.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class DateAndTine {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date d = new Date();//gives date and time 
        System.out.println("current time" + d);
        System.out.println("" + d.compareTo(d));

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before Formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        //date time formater for formating the date according to our specification 

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After Formatting: " + formattedDate);
        
        //moth day
        MonthDay month = MonthDay.now();  
    ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);  
    System.out.println(r1);  
    }

}
