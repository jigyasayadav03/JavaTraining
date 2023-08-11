/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionss;
import java.util.function.Function;

/**
 *
 * @author jigyasa_yadav
 */
public class SquareOfNumber {
    public static void main(String[] args) {
        Function <Integer, Integer> f= n->n*n;
        System.out.print("the squre is :"+f.apply(4));
        
    }
}
