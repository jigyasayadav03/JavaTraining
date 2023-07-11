/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1_8;

/**
 *
 * @author jigyasa_yadav
 */
public class FibbonacciSeries {
    public static void main(String args[]){
        int i,n=10;
        int f1=0;
        int f2=1;
        int f3;
                System.out.println(f1);
        System.out.println(f2);
        for(i=0;i<n;i++){
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
}
