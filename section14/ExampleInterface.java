/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section14;

/**
 *
 * @author jigyasa_yadav
 */
interface Member
{
    public void callback();
}

class Store
{
    Member members[]=new Member[10];
    int count=0;
       
    void register(Member m)
    {
        members[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            members[i].callback();
    }
    
}

class Customer implements Member
{
    String name;
    
    Customer(String n)
    {
        name=n;
    }
    @Override
    public void callback()
    {
        System.out.println("Ok, I will visit,"+name);
        
        
    }
    
}

public class ExampleInterface {

    
    public static void main(String[] args) 
    {
        Store s=new Store();
        Customer c1=new Customer("Jigyasa");
        Customer c2=new Customer("Sneha");
        
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();
    }
    
}
