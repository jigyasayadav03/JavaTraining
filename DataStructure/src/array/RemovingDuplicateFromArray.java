package array;

public class RemovingDuplicateFromArray {
public static void main(String[] args) {
	int arr[]= {1,2,1,3,1,4,5};
	int n=7;
	remove(arr,n);
	
}
public static void remove(int arr[],int n) {
    // Assuming arr is not null

    // Check for edge cases
    if (n <= 1) {
        return; // No duplicates to remove
    }

    // Iterate through the input array
    for (int i = 0; i < n; i++) {
        // Check for duplicates of arr[i] in the elements that follow it
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                // If a duplicate is found, remove it by shifting elements to the left
                for (int k = j; k < n - 1; k++) {
                    arr[k] = arr[k + 1];
                }
                // Reduce the size of the array
                n--;
                // Decrement j to recheck the current position for duplicates
                j--;
            }
        }
    }
    // Printing the unique elements
    for (int i = 0; i < n; i++) {
    
		System.out.println(arr[i]);
	}
}
}
