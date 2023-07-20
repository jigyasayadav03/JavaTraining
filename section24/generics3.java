/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24;

/**
 *
 * @author jigyasa_yadav
 */
class ArrayGenerics<T> {
//T is the data type of the object
    int length = 0;
    T arr[] = (T[]) new Object[10];
    //typecast 

    public void setdata(T v) {
        arr[length++] = v;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }

}

public class generics3 {

    public static void main(String[] args) {
        ArrayGenerics<Integer> a = new ArrayGenerics<>();
        a.setdata(12);
        a.setdata(23);
        a.display();
        //second type of string 
      /*  ArrayGenerics<String> s = new ArrayGenerics<>();
        s.setdata("hlo");
        s.setdata("hiii");
        s.display();
 */   }
}
