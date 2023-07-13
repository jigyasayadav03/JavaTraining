/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section20;

/**
 *
 * @author jigyasa_yadav
 */
public class BufferPractice {
    
    public static StringBuffer replace(StringBuffer s){
        s.replace(1, 4, "yadav");
        //System.out.println(s);
        System.out.println(s.length());
        return s;
    }
    static StringBuffer c=new StringBuffer("jigyasa");
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("helloWorld");
        System.out.println( s.capacity());
        System.out.println(replace(c));
        c.setCharAt(2, 'i');
        System.out.println(c);

    }
}
