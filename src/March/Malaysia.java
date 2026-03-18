package March;

import java.util.Arrays;

public class Malaysia {
	// 3Sum
	// Find all unique triplets that sum to zero.
	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int j = i + 1;
			int l = nums.length - 1;

			while (j < l) {
				int sum = nums[i] + nums[j] + nums[l];

				if (sum == 0) {
					System.out.println(nums[i] + " " + nums[j] + " " + nums[l]);
					// result.add(Arrays.asList(nums[i], nums[j], nums[l]));

					while (j < l && nums[j] == nums[j + 1]) {// Duplicate for j
						j++;
					}
					while (j < l && nums[l] == nums[l - 1]) {// Duplicate for l
						l--;
					}

					j++;
					l--;

				} else if (sum > 0) {
					l--;
				} else {
					j++;
				}

			}
		}
	}

}
