package Questions;
import java.util.*;
//1. Two Sum
public class Question1 {

	private static int[] twoSum(int[] nums, int target) {
		
		int [] result = new int[2];
		
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target-nums[i];
			if(map.containsKey(complement)) {
				result[0]=map.get(complement);
				result[1]=i;
			return result;	
			}
			map.put(nums[i], i);
		}
	return result;	
	}

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
