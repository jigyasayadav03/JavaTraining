package section1_8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */
public class Pallindrome {
    public static void main(String args[]){
        int num=3463;
        int reverse=0;
        int k=num;
        int rem;
        while(num>0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(k==reverse){
            System.out.println("pallindrome");
            
        }else 
            System.out.println("not pallindrome");
    }
}
