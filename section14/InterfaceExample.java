/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section14;

/**
 *
 * @author jigyasa_yadav
 */
interface Camera{
    public void click();
}
interface MusicPlayer extends Camera{
    public void play();
}
class Phone implements MusicPlayer{
    @Override
    public void click (){
        System.out.println("the camera clicked the photo ");
    }
    public void play(){
        System.out.println("the music started playing ");
    }
   
}
public class InterfaceExample {
   
    public static void main(String[] args) {
      
         Phone p=new Phone();
         p.click();
         p.play();
    }
}
