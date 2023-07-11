/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19;

/**
 *
 * @author jigyasa_yadav
 */


class MyData
{
    synchronized public void display(String str)
    {
            for(int i=0;i<str.length();i++)
            {
                 System.out.print(str.charAt(i));
                try{Thread.sleep(100);}
                catch(InterruptedException e){
                    System.out.println("intruption");
                }
            }
        
    }
}

class MyThread1 extends Thread
{
    MyData d;
    public MyThread1(MyData d)
    {
        this.d=d;
    }
    
    @Override
    public void run()
    {
        d.display("Hello World");
    }
            
    
}

class MyThread2 extends Thread
{
    MyData d;
    public MyThread2(MyData d)
    {
        this.d=d;
    }
    
    @Override
    public void run()
    {
        d.display("Welcome All");
    }
            
    
}

public class SynchronizationExample {
    public static void main(String[] args) 
    {
        MyData data=new MyData();
        
        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);
        
        t1.start();
        t2.start();
        
        
    
    }    
} 
