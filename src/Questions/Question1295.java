package Questions;

//1295. Find Numbers with Even Number of Digits
public class Question1295 {

	private static int countDigit(int num) {

		if (num == 0) {
			return 0;
		}

		return 1 + countDigit(num / 10);
	}

	public static void main(String[] args) {

		int[] nums = { 12, 345, 2, 6, 7896 };

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] == 0 ? 1 : countDigit(nums[i] < 0 ? -nums[i] : nums[i])) % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
