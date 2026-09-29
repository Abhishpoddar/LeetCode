package Questions;
//410. Split Array Largest Sum
public class Question410 {

	private static boolean isValid(int[] nums, int splits, int maxValue) {

		int currentSplit = 1;
		int currentValue = 0;

		for (int i = 0; i < nums.length; i++) {
			if (currentValue + nums[i] <= maxValue) {
				currentValue += nums[i];
			} else {
				currentValue = nums[i];
				currentSplit++;
			}
		}
		return currentSplit <= splits;
	}

	public static int splitArray(int[] nums, int k) {

		int max = 0;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
			sum += nums[i];
		}

		int start = max;
		int end = sum;

		int ans = 0;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (isValid(nums, k, mid)) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] nums = { 7, 2, 5, 10, 8 };
		int k = 2;

		System.out.println(splitArray(nums, k));
	}

}
