/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdaFunctions;

/**
 *
 * @author jigyasa_yadav
 */
public class ThreadsLambda {
    public static void main(String[] args) {
        Runnable r= ()->{ for(int i =0;i <10;i++){
            System.out.println("Hello Childd");
        }
            
        };
        Thread t=new Thread(r);
       t.start();
       for(int i=0;i<10;i++){
                System.out.println("hello main");
        }
        

    r.run();
    }
    }


