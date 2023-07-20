/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24;

/**
 *
 * @author jigyasa_yadav
 */
public class Generics1 {
    public static void main(String[] args) {
        Object obj =new String("java");
        // String s=obj;
        String str;//= (String)obj;
        obj= new Integer(12);
        Object ob[]=new Object[3];
        ob[0]="jigyasa";
        ob[1]="yadav";
        //ob[2]=23;
        for(int i=0;i<3;i++){
            str=(String)ob[i];
            System.out.println(ob[i]);
            
        }
    }
}
