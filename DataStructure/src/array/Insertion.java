package array;

/*public class Insertion {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 4, 5 };
		int n = 4;
		int temp = 0;
		int index = 2;
		int elemnt = 3;
		int i;
//for(i=n-1;i>=index;i--)
//{ 
		// arr[i+1]=arr[i];

		// }
		for (i = n - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		arr[index] = elemnt;
		n++;

		for (i = 0; i <= n; i++) {
			System.out.println(arr[i]);

		}
	}
}*/public class Insertion {
    public static void main(String args[]) {
        int arr[] = {1, 2, 4, 5};
        int index = 2; // Index at which you want to insert the element
        int element = 3; // Element to be inserted

        int n = arr.length+1; // Get the current length of the array

        // Check if the index is within bounds
        if (index < 0 || index > n) {
            System.out.println("Invalid index");
        } else {
            // Ensure the array has enough space for the new element
            if (n == arr.length) {
                System.out.println("Array is full");
            } else {
                // Shift elements to make space for the new element
                for (int i = n - 1; i >= index; i--) {
                    arr[i + 1] = arr[i];
                }

                // Insert the new element at the specified index
                arr[index] = element;

                // Update the value of 'n' to reflect the new size of the array
                

                // Print the updated array
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
