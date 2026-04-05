package April;
import java.util.*;
public class Tunisia {
	// 1. Two Sum
	// Example 1: Input: nums = [2,7,11,15], target = 9
	// Output: [0,1]
	// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int first = nums[i];
			int second = target - first;

			if (map.containsKey(second)) {
				result[0] = i;
				result[1] = map.get(second);
			}
			map.put(first, i);
		}
	return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		
		int [] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}
