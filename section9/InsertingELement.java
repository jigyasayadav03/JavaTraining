package section9;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author jigyasa_yadav
 */
public class InsertingELement {
   public static void main(String args[]){
       int element ;
       Scanner sc=new Scanner(System.in);
       int i;
       int a[]={1,2,4,5};
       int n=a.length;
       int index;
       element= sc.nextInt();
       index=sc.nextInt();
       for(i=n;i>index;i--){
           a[i]=a[i-1];
           a[index]=element;
       }
             for(i=0;i<=n;i++){
                 System.out.println(a[i]);
             }
       
       
   } 
}
