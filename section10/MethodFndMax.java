package section10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */
public class MethodFndMax {
    static int maxnum(int x,int y){
        if(x>y){
            return x;
        }
        else return y;
    }
    
    public static void main(String args[]){
        int a=10;
        int b=30;
        int c;
        c=maxnum(a,b);
        System.out.println(c+" is the max number");
    }
}
