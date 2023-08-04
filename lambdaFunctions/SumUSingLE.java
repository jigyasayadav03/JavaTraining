/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdaFunctions;
/**
 *
 * @author jigyasa_yadav
 */
interface Sum{
    public void sumofTwo(int a, int b);
}

public class SumUSingLE {
    public static void main(String[] args) {
        //type inference
        Sum s = (a , b )-> {  
            System.out.println(a+b);
        };
        s.sumofTwo(2,5);
    }
}
