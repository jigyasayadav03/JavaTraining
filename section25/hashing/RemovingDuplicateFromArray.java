/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.hashing;
import java.util.*;
/**
 *
 * @author jigyasa_yadav
 */

public class RemovingDuplicateFromArray {
    public static void remove(ArrayList<Integer> al){
        Set<Integer> s=new HashSet<>(al);
        System.out.println("array after removeing duplicates ");
        System.out.println(s);
    }
    public static void main(String[] args) {
        int arr[]=new int [5];
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
                
    } 
        for(i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        ArrayList <Integer>al=new ArrayList<>();
        Arrays.asList(arr);
        for(i=0;i<5;i++){
       al.add(arr[i]);
        }
        System.out.println(al);
        
        
        remove(al);
    }
}
