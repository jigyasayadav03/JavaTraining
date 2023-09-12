package array;

public class DeletionFromArray {
    public static void main(String args[]) {
        int i;
        int a[] = { 1, 2, 3, 4, 5 };
        int index = 2;
        int n = a.length;
        System.out.println(n);
        
        // i want to delete 3 from the array
        for (i = index; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        
        // Decrease the size of the array
        n--;

        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
