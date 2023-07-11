/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19;

/**
 *
 * @author jigyasa_yadav
 */
public class ExampleTHread1 {
    
static class MyThread1 extends Thread {

	
	public void run() {

		
		System.out.println("Thread 1 is running");
	}

         void sleep() {
             System.out.println("thread in sleep");
         }
    }
static class MyThread2 extends Thread {

	
	public void show() {

		
		System.out.println("Thread 2");
	}
}	
	public static void main(String[] args) {

		MyThread1 obj1 = new MyThread1();
		MyThread2 obj2 = new MyThread2();

		
		obj1.start();
                 System.out.println(obj1.getState());
                    obj1.sleep();
                    System.out.println(obj1.getState());
		obj2.start();
                System.out.println(obj2.getState());
                System.out.println(obj2.isAlive());
	}
}


