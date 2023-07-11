/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section9;

/**
 *
 * @author jigyasa_yadav
 */
public class SubArraySum {
		void subArraySum(int arr[], int n, int sum)
	{
		
		for (int i = 0; i < n; i++) {
			int currentSum = arr[i];

			if (currentSum == sum) {
				System.out.println("Sum found at indexe "
								+ i);
				return;
			}
			else {
				
				for (int j = i + 1; j < n; j++) {
					currentSum += arr[j];

					if (currentSum == sum) {
						System.out.println(
							"Sum found between indexes " + i
							+ " and " + j);
						return;
					}
				}
			}
		}
		System.out.println("No subarray found");
	
	}

	public static void main(String[] args)
	{
		SubArraySum arraysum = new SubArraySum();
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		arraysum.subArraySum(arr, n, sum);
	}
}


