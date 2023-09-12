package array;

public class InsertionInarray {
public static void main(String args[]) {

	        int[] originalArray = {1, 2, 3, 4, 5};
	        int elementToInsert = 10; // Element to insert
	        int positionToInsert = 2; // Position to insert (0-based index)

	        // Check if the position is valid
	        if (positionToInsert < 0 || positionToInsert > originalArray.length) {
	            System.out.println("Invalid position to insert");
	            return;
	        }

	        // Create a new array with increased length
	        int[] newArray = new int[originalArray.length + 1];

	        // Copy elements from the original array to the new array up to the specified position
	        for (int i = 0; i < positionToInsert; i++) {
	            newArray[i] = originalArray[i];
	        }

	        // Insert the element at the specified position
	        newArray[positionToInsert] = elementToInsert;

	        // Copy the remaining elements from the original array to the new array
	        for (int i = positionToInsert; i < originalArray.length; i++) {
	            newArray[i + 1] = originalArray[i];
	        }

	        // Print the new array
	        System.out.print("Original Array: ");
	        for (int num : originalArray) {
	            System.out.print(num + " ");
	        }

	        System.out.println();
	        
	        System.out.print("Array after insertion: ");
	        for (int num : newArray) {
	            System.out.print(num + " ");
	        }
}
	    }