/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Annoynymus;

/**
 *
 * @author jigyasa_yadav
 */
interface Left {

    default void m1() {
        System.out.println("overide left");
    }

}

interface Right {

    default void m1() {
        System.out.println("overide right");
    }

}

public class LeftRIghtInterface implements Right, Left {

    @Override
    public void m1() {
        Left.super.m1();
    }

    public static void main(String[] args) {
        LeftRIghtInterface x = new LeftRIghtInterface();
        x.m1();
    }

}
