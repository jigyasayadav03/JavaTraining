/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section20;

/**
 *
 * @author jigyasa_yadav
 */
public class StringClassPractice {

    public static void main(String[] args) {
        String s1 = new String("Hello");

        StringBuffer s2 = new StringBuffer("Hello");

        StringBuilder s3 = new StringBuilder("Hello");
        StringBuilder s5 = s3;
        String s4 = s1.concat(" World");
        s2.append(" World");
        s3.append(" World");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1.charAt(3));
        System.out.println(s3.equals(s2));
        System.out.println(s3.equals("Hello World"));
        System.out.println(s3.equals(s5));
       // System.out.println(s1.isEmpty());
//  System.out.println(s3.(s2));
    }

}
