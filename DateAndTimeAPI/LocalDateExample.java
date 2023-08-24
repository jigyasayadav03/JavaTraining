/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateAndTimeAPI;

import java.time.*;

/**
 *
 * @author jigyasa_yadav
 */
public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        
        System.out.println(date);
        System.out.println("the day is " + date.getDayOfMonth());
        System.out.println("day of week is " + date.getDayOfWeek());
        System.out.println("the year is " + date.getYear());
        System.out.println("" + date.getChronology());
        System.out.println(date.getEra());
        System.out.println(date.atTime(12, 34));
        System.out.println(date.isAfter(date));
        
    }
    
}
