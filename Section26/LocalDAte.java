/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section26;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jigyasa_yadav
 */
public class LocalDAte {

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
        LocalTime m = LocalTime.now();
        System.out.println(m);
        System.out.println(myObj.getChronology());
        System.out.println(myObj.plusDays(45));
        LocalDate date1 = LocalDate.of(2017, 1, 13);
        System.out.println(date1.isLeapYear());
        LocalDate date2 = LocalDate.of(2016, 9, 23);
        System.out.println(date2.isLeapYear());
        //parsing 
        String dInStr = "2011-09-01";
        LocalDate d1 = LocalDate.parse(dInStr);
        System.out.println("String to LocalDate : " + d1);
        //for time 
        /* LocalTime time1 = LocalTime.of(10, 43, 12);
        System.out.println(time1);
        LocalTime time2 = time1.minusHours(2);
        LocalTime time3 = time2.minusMinutes(34);
        System.out.println(time3);
         */
        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("India Time Zone: " + time1);
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Japan Time Zone: " + time2);
        long hours = ChronoUnit.HOURS.between(time1, time2);
        System.out.println("Hours between two Time Zone: " + hours);
        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        System.out.println("Minutes between two time zone: " + minutes);
    }
}
