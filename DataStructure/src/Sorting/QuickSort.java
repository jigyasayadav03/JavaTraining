package Sorting;

public class QuickSort {
	public void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pit =partition(arr,low,high);
		
		quickSort(arr,low,pit-1);
		quickSort(arr,pit+1,high);
		}
	}
	public static int  partition(int arr[],int low ,int high) {
		int pivot =arr[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=pivot;
		arr[high]=temp;
		
		return  i;
		
	}
	
	public void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
public static void main(String[] args) {
	QuickSort q= new QuickSort();
	int arr[]= {2,6,7,8,4,1,5,3};
	int n=arr.length;
	q.quickSort(arr, 0, n-1);
	q.printArray(arr, n);
}
}
