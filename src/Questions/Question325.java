package Questions;
import java.util.*;
//325. Maximum Size Subarray Sum Equals k
public class Question325 {

	public static int longestSubarray(int[] nums, int target) {

		for (int i = 1; i < nums.length; i++) {
			nums[i] += nums[i - 1];
		}

		int maxLength = 0;

		Map<Integer, Integer> map = new HashMap<>();

		map.put(0, -1);

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i] - target)) {
				int prevIndex = map.get(nums[i] - target);
				maxLength = Math.max(maxLength, i - prevIndex);
			}
			map.putIfAbsent(nums[i], i);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 5, 2, 7, 1, -10 };

		System.out.println(longestSubarray(nums, 15));
	}

}
