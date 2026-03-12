package month1;

import java.util.Arrays;

public class Kazakhstan {
//	Valid Triangle Number
//	Count triplets that can form a triangle.
//	Fix one element and use two pointers to find valid pairs.
//	nums = [2, 2, 3, 4]
//	Output 3
	public static void main(String[] args) {

		int[] nums = { 2, 2, 3, 4 };
		Arrays.sort(nums);
		int count = 0;

		for (int k = nums.length - 1; k >= 2; k--) {

			int left = 0;
			int right = k - 1;

			while (left < right) {
				if (nums[left] + nums[right] > nums[k]) {
					count += right - left;
					right--;
				} else {
					left++;
				}
			}
		}

		System.out.println(count);
	}
}
