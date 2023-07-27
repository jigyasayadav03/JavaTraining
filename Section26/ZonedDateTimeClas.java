/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section26;
 import java.util.*;
import java.time.*;
/**
 *
 * @author jigyasa_yadav
 */
public class ZonedDateTimeClas {
    public static void main(String[] args) {
        ZonedDateTime xd=ZonedDateTime.now();
        System.out.println(xd);//prints With zone
        OffsetDateTime s=OffsetDateTime.now();
        System.out.println(s);//print without zone
          ZonedDateTime d=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(xd);
        MonthDay m=MonthDay.now();
        System.out.println(m.getDayOfMonth());
    }
}
