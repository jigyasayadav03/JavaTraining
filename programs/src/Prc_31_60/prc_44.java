package Prc_31_60;

public class prc_44 {
	public static void main(String[] args) {

		double[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double SD = calculateSD(num);

		System.out.format("Standard Deviation = %.6f", SD);
	}

	public static double calculateSD(double arr[]) {
		double sum = 0.0, standardDeviation = 0.0;
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			sum += arr[i];
		}

		double mean = sum / length;

		for (int i = 0; i < length; i++) {
			standardDeviation += Math.pow(arr[i] - mean, 2);
		}
		double sd = standardDeviation / length;
		return Math.sqrt(sd);
	}
}
