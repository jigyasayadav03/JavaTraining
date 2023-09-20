package array;

import java.util.Scanner;

public class Reversearray {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	int arr[]=new int[5];
	System.out.println("enter the array elements:");
	for(int i=0;i<5;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<5;i++) {
		System.out.print( arr[i]);
	}
	//reverse array
int temp=0;
	for(int i=0,j=4;i<j;i++,j--) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	System.out.println("");
	for(int i=0;i<5;i++) {
		System.out.print( arr[i]);
	}
	
}
}
