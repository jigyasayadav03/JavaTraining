package Sorting;

public class InsertionSort {
public static void main(String args[]) {
	int arr[]= {6,3,2,5,1,4};
	int i;
	int j;
	int key;
	 int n = arr.length;
     for (i = 1; i < n; ++i) {
         key = arr[i];
         j = i - 1;

         while (j >= 0 && arr[j] > key) {
             arr[j + 1] = arr[j];
             j = j - 1;
         }
         arr[j + 1] = key;
     }
for(i=0;i<5;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
