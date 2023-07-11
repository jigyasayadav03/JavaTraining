/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19;

/**
 *
 * @author jigyasa_yadav
 */
class MyClass extends Thread{
    @Override
    public void run(){
        int i=1;
        while(true){
            System.out.println("hello"+i);
            i++;
        }
    }
}
public class MultithreadingusingTHread {
    public static void main(String[] args) {
        MyClass t=new MyClass();
        t.start();
       // t.wait();
        int i=1;
        while(true){
            System.out.println("world"+i);
            i++;
        }
    }
}
