package section9;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jigyasa_yadav
 */
public class AddArrayElements {
    public static void main(String args[]){
        int i,j;
        int c[][]=new int[3][3];
        int arr[][]={{4, 5, 3, 2 },
                { 9, 5, 6, 2 },
                { 1, 5, 3, 5 }
                };
        int arr1[][]={{4, 5, 3, 2 },
                { 9, 5, 6, 2 },
                { 1, 5, 3, 5 }};
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                c[i][j]=arr[i][j]+arr1[i][j];
            }
        }
       
           for(i=0;i<3;i++){
            for(j=0;j<3;j++){
              System.out.print(c[i][j]+" ");
            }System.out.println(" ");
        }
               
           
     
    }
}
