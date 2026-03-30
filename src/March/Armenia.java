package March;

public class Armenia{

	public static void main(String[] args) {
		int[] nums = {23,2,4,6,7};
		int k = 6;

		boolean result = false;

		for (int i = 0; i < nums.length; i++) {
			int sum = 0, count = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				count++;

				if ((sum == 0 || sum % k == 0) && count >= 2) {
					result = true;
				}
			}
		}
		System.out.println(result);
	}

}
