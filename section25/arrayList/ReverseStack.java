/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.arrayList;

import java.util.Stack;

/**
 *
 * @author jigyasa_yadav
 */
public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        Stack<Integer> s1 = new Stack<>();
        int pope;
        while (s.size() != 0) {
            pope = s.pop();
            s1.add(pope);
        }
        System.out.println(s1);
    }

}
