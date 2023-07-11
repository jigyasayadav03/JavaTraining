package section1_8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author jigyasa_yadav
 */
public class Factorial {
    public static void main(String args[]){
        int n=5;
        int i;
        int result= 1;
        for(i=1;i<=n;i++){
            result=(result*i);
        }
        System.out.println(result);
    }
}
