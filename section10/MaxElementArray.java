package section10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author jigyasa_yadav
 */
public class MaxElementArray {
 static void findMax(int arr[],int n){
     int max=arr[0];
     for(int i=0;i<n;i++){
         if(arr[i]>max){
             max=arr[i];
         }
     }
     System.out.println("max is "+max);
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
          }
          findMax(arr,n);
    }
}
