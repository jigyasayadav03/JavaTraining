/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colon;

/**
 *
 * @author jigyasa_yadav
 */
interface Constru {

    //functional inteface which has one abstract method
    //that is get which has a return type of constructor 
    public ConstructorUSingMEthodRef get();
}

public class ConstructorUSingMEthodRef {
// constructor which pprint hello

    public ConstructorUSingMEthodRef() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Constru c = ConstructorUSingMEthodRef::new;
        //it will create the obj of the constructor
        ConstructorUSingMEthodRef v = c.get();

    }
}
