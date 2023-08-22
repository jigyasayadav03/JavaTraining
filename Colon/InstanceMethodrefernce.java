/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colon;

/**
 *
 * @author jigyasa_yadav
 */
interface Showw {

    public void m1();

}

public class InstanceMethodrefernce {
//show is the instance method
    
    public void show() {
        System.out.println("Hello!! ");
    }

    public static void main(String[] args) {
        InstanceMethodrefernce i = new InstanceMethodrefernce();//object of the public class which has show method

        Showw reference = i::show; // Creating a reference to the show() method
        reference.m1(); // Calling the m1() method through the reference
    }

}
