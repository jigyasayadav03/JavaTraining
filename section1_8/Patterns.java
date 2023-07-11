/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section1_8;

/**
 *
 * @author jigyasa_yadav
 */
public class Patterns {
    public static void main(String args[]){
        int i;
        int j;
        //int num=0;
        //for(i=1;i<=5;i++){
           // for(j=1;j<=i;j++){
            //     num++;
           //     System.out.print(num+" ");
               
           // }
          //  System.out.println(" ");
        //}
        int k;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(j=5;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
