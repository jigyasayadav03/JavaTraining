/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section26;

import java.time.OffsetDateTime;
import java.util.*;

/**
 *
 * @author jigyasa_yadav
 */
public class Calendarclass {

    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        TimeZone t = c.getTimeZone();
        System.out.println(t);
        System.out.println(t.getID());
 OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.toLocalDate());  
    
        // Creating an object of Calendar class
        Calendar cd = Calendar.getInstance();

        System.out.println("Day of week : "
                + cd.get(Calendar.DAY_OF_WEEK));

        System.out.println("Day of year : "
                + cd.get(Calendar.DAY_OF_YEAR));

        System.out.println("Week in Month : "
                + cd.get(Calendar.WEEK_OF_MONTH));

        System.out.println("Week in Year : "
                + cd.get(Calendar.WEEK_OF_YEAR));

        System.out.println(
                "Day of Week in Month : "
                + cd.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println("Hour : "
                + cd.get(Calendar.HOUR));

        System.out.println("Minute : "
                + cd.get(Calendar.MINUTE));

        System.out.println("Second : "
                + cd.get(Calendar.SECOND));

        System.out.println("AM or PM : "
                + cd.get(Calendar.AM_PM));

        System.out.println("Hour (24-hour clock) : "
                + cd.get(Calendar.HOUR_OF_DAY));
    }
}


