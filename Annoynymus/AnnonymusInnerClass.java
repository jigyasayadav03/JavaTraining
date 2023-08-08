package Annoynymus;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */
public class AnnonymusInnerClass {
    public static void main(String[] args) {
   /*   Runnable r= ()->{
          for(int i=0;i<10;i++){
              System.out.println("child Thread");
          }
      };
      Thread t=new Thread(r);
      t.start();*/
      Thread t1=new Thread(()-> {for(int i=0;i<10;i++){
              System.out.println("child Thread");
          }} );
      t1.start();
      for(int j=0;j<10;j++){
          System.out.println("main Thread");
         
      }
    }
}
