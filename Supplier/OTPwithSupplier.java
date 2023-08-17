/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supplier;
import java.util.function.Supplier;

/**
 *
 * @author jigyasa_yadav
 */
public class OTPwithSupplier {
    public static void main(String[] args) {
        Supplier< String> s= ()-> {
        
                String otp="";
                for(int i=0;i<6;i++){
                    otp= otp + (int)(Math.random()*10);
                }
                return otp;
            };
        System.out.println(s.get());
               
    }
}
