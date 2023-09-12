package Sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
int n = 10;
int arr[] = new int[n];
int i;
for (i = 0; i < 10; i++) {
	arr[i] = sc.nextInt();
}
for(i=0;i<n;i++) {
	System.out.println(arr[i]);
	}
selectionSort(arr,n);
}
	public static void selectionSort(int arr[],int n) {
		int i,j;
		int temp=0;
		for(i=0;i<n;i++) {
			int min=i;
			for(j=i+1;j<n;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;	
		}
		for(i=0;i<10;i++) {
			System.out.println(arr[i]);
			
		}	
		
	}
}
