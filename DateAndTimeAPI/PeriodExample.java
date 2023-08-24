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
public class PeriodExample {

    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalDate startDate = LocalDate.parse("2017-02-13");

        Period p = Period.between(startDate, d);
        System.out.println(p);
        System.out.println(p.getChronology());
        System.out.println("the date after plusing 6 date" + p.plusDays(6));

    }

}
