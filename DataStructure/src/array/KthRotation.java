package array;
import java.util.Scanner;

public class KthRotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int n = arr.length;
        System.out.println("enter the rotation size");
        int k = sc.nextInt();
        int temp[] = new int[k];

        System.out.println("Enter the array elements here: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }

        // Rotate the array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = n - k, j = 0; i < n; i++, j++) {
            arr[i] = temp[j];
        }

        System.out.println("\nThe array elements after rotation are:");

        for (int m = 0; m < n; m++) {
            System.out.print(arr[m] + ",");
        }
    }
}
