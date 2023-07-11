/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19;

/**
 *
 * @author jigyasa_yadav
 */
public class Example2 {
   static  class Thread11 extends Thread   
{  
      
    @Override
    public void run()   
    {  
        System.out.println("Thread 1");  
        System.out.println("i in Thread 1 ");  
       
        System.out.println("Thread 1 Completed.");  
    }  
}  
  
/* Thread 2 */  
static class Thread12 extends Thread   
{  
    public void run()   
    {  
        System.out.println("Thread 2");  
        System.out.println("i in Thread 2 ");  
        for (int i = 1; i <= 5; i++)  
        {  
            System.out.println("i = " + i);  
        }  
        System.out.println("Thread 2 Completed.");  
    }  
}  
  
    public static void main(String[] args) {  
   
    Thread11 t1 = new Thread11();  
    Thread12 t2 = new Thread12();  
     t1.start();  
  
    t2.yield();  
       try   
    {  
        t1.sleep(1000);  
    }   
    catch (InterruptedException e)   
    {  
        e.printStackTrace();  
    }  
    t2.start();  
    System.out.println("Main Thread End");  
 }  
}  

