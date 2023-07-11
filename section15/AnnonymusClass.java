/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section15;

/**
 *
 * @author jigyasa_yadav
 */
abstract class  Annonymus{
    public abstract void show();
}
class My extends Annonymus{
   @Override
   public void show(){
        System.out.println("hello");
    }
}
public class AnnonymusClass {
    public static void main(String[] args) {
        
    
    Annonymus A=new Annonymus(){
        @Override
        public void show(){
            System.out.println("helllo Annonymus class method");
        }
        
    };
    A.show();
} 

}
