/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section12;

/**
 *
 * @author jigyasa_yadav
 */

    class Student{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
public class ThisKeyword {  
public static void main(String args[]){  
Student s1=new Student(111,"Jigyasa",500f);  
Student s2=new Student(112,"khushi",600f);  
s1.display();  
s2.display();  
}
} 

