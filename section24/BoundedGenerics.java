/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section24;

/**
 *
 * @author jigyasa_yadav
 */
class Array3<T extends Number>{
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
public class BoundedGenerics {
    
    static <K> void show(K[] list){
        for(K x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show(new String[]{"hii","hlo"});
    
  //  Array3<String> s=new Array3<>();
     Array3<Integer> i=new Array3<>();
      Array3<Float> f=new Array3<>();
      Array3<Byte> B=new Array3<>();
}
}
