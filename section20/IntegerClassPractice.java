/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section20;

/**
 *
 * @author jigyasa_yadav
 */
public class IntegerClassPractice {

    public static void main(String[] args) {
        int m = 10;
        Integer m1 = Integer.valueOf(m);
        Integer m2 = Integer.valueOf("1234");
        Integer m3 = Integer.valueOf("0101010", 2);
        System.out.println(m3);
        System.out.println(m1.reverse(123));
        System.out.println(m1.hashCode());
        System.out.println(m2);
        System.out.println("sign is " + m2.signum(-234));

        System.out.println(Integer.toBinaryString(456));
        System.out.println(m1.doubleValue());
        float a = 12.5f;
        Float d = 12.5f;
        Float c = -12.5f / 0;
        Float b = (float) Math.sqrt(9);

        System.out.println(b.equals(a));
        System.out.println(b.isInfinite());
        System.out.println(Float.POSITIVE_INFINITY == b);
        System.out.println(b == Float.NEGATIVE_INFINITY);
        System.out.println(b.isNaN());
        System.out.println(b != Float.NaN);
    }
}
