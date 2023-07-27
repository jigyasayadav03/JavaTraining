/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Section26;

/**
 *
 * @author jigyasa_yadav
 */

import java.time.LocalDateTime;  
import java.time.temporal.ChronoField;  

public class LocalDateAndTime {  
  public static void main(String[] args) {  
    LocalDateTime a = LocalDateTime.of(2023, 7, 30, 15, 56);    
    System.out.println(a.get(ChronoField.DAY_OF_WEEK));  
    System.out.println(a.get(ChronoField.DAY_OF_YEAR));  
    System.out.println(a.get(ChronoField.DAY_OF_MONTH));  
    System.out.println(a.get(ChronoField.HOUR_OF_DAY));  
    System.out.println(a.get(ChronoField.MINUTE_OF_DAY));   
  }  
}  