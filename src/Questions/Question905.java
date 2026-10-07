package Questions;

import java.util.*;

//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
public class Question905 {

	private static void getSwap(int[] nums, int i, int j) {

		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static int[] sortArrayByParity(int[] nums) {

		int i = 0;
		int j = nums.length - 1;

		while (i < j) {
			if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
				getSwap(nums, i, j);
				i++;
				j--;
			}

			if (nums[i] % 2 == 0) {
				i++;
			}
			if (nums[j] % 2 != 0) {
				i--;
			}
		}
		return nums;
	}

	public static void main(String[] args) {

		int[] nums = { 3, 1, 2, 4 };
		System.out.println(Arrays.toString(sortArrayByParity(nums)));

	}

}
