/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumerrr;

import java.util.function.*;

/**
 *
 * @author jigyasa_yadav
 */

class Movieee {

    String name;
    String result;

    Movieee(String name, String result) {
        this.name = name;
        this.result = result;
    }
}

public class ChainingInConsumer {

    public static void main(String[] args) {
        Consumer<Movieee> c1 = m -> System.out.println("Movie:" + m.name + " is ready to release");
        Consumer<Movieee> c2 = m -> System.out.println("Movie:" + m.name + " is just Released and it is:" + m.result);

        Consumer<Movieee> c3 = m -> System.out.println("Movie:" + m.name + " information storing in the database");
        Consumer<Movieee> chainedC = c1.andThen(c3).andThen(c2);

        Movieee m1 = new Movieee("Bahubali", "Hit");
        chainedC.accept(m1);
        Movieee m2 = new Movieee("Spider", "Flop");
        chainedC.accept(m2);
    }
}
