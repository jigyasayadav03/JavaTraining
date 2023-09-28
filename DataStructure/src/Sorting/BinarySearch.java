package Sorting;

public class BinarySearch {
	public int search(int arr[],int k,int low, int high) {
//	int n = arr.length;
	if(low<=high) {
	int mid=low+high/2;
    if (arr[mid] == k) {
        return mid;}
	if(k<arr[mid]) {
		return search(arr,k,low,mid-1);
	}
	else if(k>arr[mid]) {
		return search(arr,k,mid+1,high);
	}}

		return -1;
	}
	
public static void main(String[] args) {
	BinarySearch b=new  BinarySearch();
	int arr[]= {2,6,7,8,4,1,5,3};
	int n=arr.length;
System.out.println(b.search(arr,6,0,n-1));
	

}
}
