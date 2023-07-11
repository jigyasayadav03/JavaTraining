package section11;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */
public class ReverseOverload {
     static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
  
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.print(" "  + b[k]);
        }System.out.println();
    }
   static void reverse(int n){
       int a=n;
       int rem=0;
       int rev=0;
  while(n>0)     {
  rem=n%10;
  rev=rev*10+rem;
  n=n/10;
  } System.out.println("reversed number is " +rev);
   }
    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    //    reverse(arr.length, arr);
        int n=1234;
        reverse(n);
    }

}
