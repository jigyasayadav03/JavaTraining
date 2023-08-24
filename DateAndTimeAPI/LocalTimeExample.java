/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author jigyasa_yadav
 */
public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println("the hour going on is " + time.getHour());
        System.out.println("the seconds going on is " + time.getSecond());
        System.out.println("the minus min  is " + time.minusMinutes(45));
        System.out.println("the plus min is " + time.plusMinutes(45));
        System.out.println("the plus hour is " + time.plusHours(4));

    }
}
