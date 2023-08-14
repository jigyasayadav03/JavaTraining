/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumerrr;
import java.util.function.Consumer;
/**
 *
 * @author jigyasa_yadav
 */
public class PrintHello {
    public static void main(String[] args) {
        Consumer <String> c= (s)-> System.out.println( "Hello !! "+ s);
    c.accept("Jigyasa ");
    }
}
