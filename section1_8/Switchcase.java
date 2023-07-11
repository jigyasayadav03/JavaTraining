package section1_8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author jigyasa_yadav
 */
public class Switchcase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of day"); 
                int n= sc.nextInt();
                switch(n){
                    case 1: System.out.println("Monday");
                    break;
                 case 2: System.out.println("Tuesday");
                    break;
                     case 3: System.out.println("Wednesday");
                    break;
                     case 4: System.out.println("Thursday");
                    break;
                     case 5: System.out.println("Friday");
                    break;
                     case 6: System.out.println("Saturday");
                    break;
                     case 0: System.out.println("Sunday");
                    break;
                    default: 
                          System.out.println("Enter a valid day");
                    break;
                }
        
    }
}
