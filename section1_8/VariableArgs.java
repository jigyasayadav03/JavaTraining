package section1_8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */
public class VariableArgs {
    static void add(int ...x){
        int sum=0;
        for(int j=0;j<x.length;j++){
            sum=sum+x[j];
        }
        System.out.println(sum);
    }
    //static void show(int...x){
      //  if(x.length==0){
   //         System.out.println(0);
       //   
       // }
       //int m= x[0];
        //       for(int i=0;i<x.length;i++){
       //    if(x[i]>m){
        //       m=x[i];
        //   }
      //} System.out.println(m);
    //}
       
           public static void main(String[] args) {
        //show();
        add(10,30,23,23);
        
    }
}
