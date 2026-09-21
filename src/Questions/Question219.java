package Questions;

import java.util.*;

//219. Contains Duplicate II
//Example 1:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
public class Question219 {

	private static boolean result(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int previouIndex = map.get(nums[i]);

				if (i - previouIndex <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}

	}

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 1 };
		int k = 1;

		System.out.println(result(nums, k));
	}

}
