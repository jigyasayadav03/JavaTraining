/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdaFunctions;

interface StringLEngth {

    public void Slength(String str);

    public static void s() {
        System.out.println("the length of string is");
    }
}

/**
 *
 * @author jigyasa_yadav
 */
public class LengthOfString {

    public static void main(String[] args) {

        String ss = "jigyasa yadav";
        StringLEngth st = (l) -> System.out.println(l.length());

        st.Slength(ss);
    }
}
