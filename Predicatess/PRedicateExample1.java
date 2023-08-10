/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Predicatess;

import java.util.function.Predicate;

/**
 *
 * @author jigyasa_yadav
 */
/*public class PRedicateExample1 implements Predicate <Integer> {
    @Override
    public boolean test(Integer t){
        if(t>10) {
            return true;
        } else 
            return false;
    }

    public static void main(String[] args) {
     
       PRedicateExample1  p =new  PRedicateExample1();
//= //i -> (i < 20);
System.out.println(p.test(20));
        
        //System.out.println(p.test(10));
    }

    

    
}
*/

import java.util.function.Predicate;
public class PRedicateExample1 {
	public static void main(String[] args)
	{
		Predicate<Integer> p= i -> (i < 10);

		System.out.println(p.test(20));
                //System.out.println(p.test(20.6));
	}
}
