package array;
import java.util.*;
public class TwoDimensionalArray {
public static void main(String args[]) {
	int arr[][]=new int[3][3];
	int i,j;
	Scanner sc=new Scanner(System.in);
	
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
		arr[i][j]=sc.nextInt();
		
		}
		
	}

	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			//searching for element 
			if(arr[i][j]==2) {
				//System.out.println("the value found in the array at row number "+i+" and the column is "+j);
				//finding element and printing 0 there 
				arr[i][j]=0;
			}
			}
		
		
	}
	
	
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
		System.out.print(arr[i][j]);
			}
		System.out.println(" ");
		
		
	}
	
	
}
}
