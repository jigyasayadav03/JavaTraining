/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1_8;
import java.util.Scanner;
/**
 *
 * @author jigyasa_yadav
 */
public class LeapYearPRogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = scanner.nextInt();
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println(y + " is a leap year.");
                } else {
                    System.out.println(y + " is not a leap year.");
                }
            } else {
                System.out.println(y + " is a leap year.");
            }
        } else {
            System.out.println(y + " is not a leap year.");
        }
    }
}
