/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateAndTimeAPI;

import java.time.Year;

/**
 *
 * @author jigyasa_yadav
 */
public class YearExample {

    public static void main(String[] args) {
        Year y = Year.now();
        System.out.println(y);
        System.out.println("Hashcode of the year: " + y.hashCode());

        if (y.isLeap()) {
            System.out.println("leap year");

        } else {
            System.out.println("not a leap year ");
        }

        Year yr = Year.of(2024);
        System.out.println(yr.isLeap());

        //is before methoed
        Year firstYear = Year.of(2023);
        Year secondYear = Year.of(2397);
        System.out.println(firstYear.isBefore(secondYear));

    }
}
