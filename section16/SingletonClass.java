/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section16;

/**
 *
 * @author jigyasa_yadav
 */
class CoffeeMachine
{
    private float coffeQuantity;
    private float milkQuantity;
    private float waterQuantity;
    private float sugarQuantity;
    
    static private CoffeeMachine my=null;
    
    private CoffeeMachine()
    {
        coffeQuantity=1;
        milkQuantity=1;
        waterQuantity=1;
        sugarQuantity=1;
    }
    
    public void fillWater(float qty)
    {
        waterQuantity=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQuantity=qty;
    }
    public float getCoffee()
    {
        return 0.15f;
    }
    
    static CoffeeMachine getInstance()
    {
        if(my==null)
            my=new CoffeeMachine();
        return my;
    }
    
            
}
public class SingletonClass 
{
    public static void main(String[] args) 
    {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
     
        if(m1==m2 && m1==m3)
            System.out.println("Same");
        
    }   
}