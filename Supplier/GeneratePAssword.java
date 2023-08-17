/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supplier;

import java.util.function.*;
import java.util.*;

/**
 *
 * @author jigyasa_yadav
 */
public class GeneratePAssword {

    public static void main(String[] args) {
        Supplier<String> s = ()
                -> {

            Supplier<Integer> d = () -> (int) (Math.random() * 10);
            String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
            Supplier<Character> c = () -> symbols.charAt((int) (Math.random() * 55));
            String pwd = "";
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {
                    pwd = pwd + d.get();
                } else {
                    pwd = pwd + c.get();
                }
            }
            return pwd;
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        
    }
}
