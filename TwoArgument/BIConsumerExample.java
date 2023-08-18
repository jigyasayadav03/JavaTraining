/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TwoArgument;
import java.util.function.BiConsumer;
/**
 *
 * @author jigyasa_yadav
 */
public class BIConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,String> c=(a,b)-> System.out.println(a+"" +b);
        c.accept("Jigyasa ", "Yadav");
    }
}
