/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DateAndTimeAPI;
import java.time.ZoneId;

/**
 *
 * @author jigyasa_yadav
 */
public class ZoneIdExample {
    public static void main(String[] args) {
    ZoneId z= ZoneId.systemDefault();
        System.out.println(z);
        System.out.println(z.getRules());
    
        System.out.println(z.getId());
    
    }
    
    
    }
