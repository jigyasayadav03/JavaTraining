/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.Dequeue;
import java.util.*;
/**
 *
 * @author jigyasa_yadav
 */
public class CheckPallindrome {
    public static void main(String[] args) {
        Deque <Character> s=new ArrayDeque<>();
         String c= "Malayalam";
        String str= c.toLowerCase();
        int count=0;
       for(int i=0;i<str.length();i++)
       
       {
           s.add(str.charAt(i));
           
       }
        System.out.println(s.size()/2);
        System.out.println(s);
        while(s.size()>1){
     
        char f=s.peekFirst();
        s.pollFirst();
        char l=s.peekLast();
        s.pollLast();
        if(f==l){
            count= count+1;
        } 
        
        }
        if(count== str.length()/2)
        {
            System.out.println("it is a pallindrome ");
        }   else 
            System.out.println("not a pallindrome;");
        
        
    }
}
