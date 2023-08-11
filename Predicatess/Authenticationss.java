/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicatess;
import java.util.Scanner;
import java.util.function.Predicate;
/**
 *
 * @author jigyasa_yadav
 */
class User {
    String email;
    String password;
    User(String email, String password){
        this.email=email;
        this.password=password;
        
    }
}
public class Authenticationss {
    public static void main(String[] args) {
        Predicate <User> p=(user)-> 
                user.email.equals("durga")&& user.password.equals("java");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter email");
        String email=sc.next();
        System.out.println("enter password");
        String password=sc.next();
        User u= new User(email,password);
        if(p.test(u)){
            System.out.println("you are a valid user");
        }else 
            System.out.println("not a valid user");
        
    }
}
