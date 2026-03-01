package month1;

public class March01 {

	// Kadane algorithm
	// find array with max sum

	public static void main(String[] args) {
		int[] array = { 1, 3, -9, 2, 8 }; // 10

		int currentSum = 0, maxSum = 0;
		for (int i = 0; i < array.length; i++) {
			currentSum = Math.max(array[i], currentSum + array[i]);

			maxSum = Math.max(maxSum, currentSum);
		}
		System.out.println(maxSum);

	}

}
