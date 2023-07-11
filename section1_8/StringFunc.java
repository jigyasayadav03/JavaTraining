/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section1_8;

/**
 *
 * @author jigyasa_yadav
 */
public class StringFunc
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Helllo World"); 
        String s="Sachin";    
 System.out.println(s.startsWith("Sa"));//true    
 System.out.println(s.endsWith("n"));//true   
 System.out.println(s.charAt(0));//S    
System.out.println(s.charAt(3));//h
System.out.println(s.length());//6    



String s1="Java is a programming language. Java is a platform. Java is an Island.";      
String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
System.out.println(replaceString);    
    }
    
}
