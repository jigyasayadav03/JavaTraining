/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.hashing;

/**
 *
 * @author jigyasa_yadav
 */

import java.util.StringTokenizer;  
public class StringTokenizerDemo{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("my name is khan"," "); 
    System.out.println("Total number of Tokens: "+st.countTokens()); 
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
          System.out.println("Total number of Tokens: "+st.countTokens()); 
   }  
}  