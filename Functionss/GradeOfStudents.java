/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Functionss;

import java.util.Scanner;
import java.util.function.Function;

/**
 *
 * @author jigyasa_yadav
 */
public class GradeOfStudents {

    public static void main(String[] args) {
        Function<Integer, String> f = n -> {
            if (n > 90) {
                return "A";
            } else if (n < 90 && n > 70) {
                return "B";
            } else if (n < 70 && n > 50) {
                return "C";
            } else if (n < 50 && n > 33) {
                return "D";
            } else {
                return "E";
            }
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you marks to find your grade : ");
        int n = sc.nextInt();
        System.out.println("The grade is : " + f.apply(n));

    }
}
