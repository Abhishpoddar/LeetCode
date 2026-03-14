package month1;
import java.util.Arrays;
public class Uzbekistan {
//	Two Sum II – Input Array Is Sorted
//	Find two numbers in a sorted array that add up to a target.
//	Use left and right pointers moving toward each other
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 2, 3, 4, 4, 5, 6, 7, 8, 9 };
		int target = 6;
		
		Arrays.sort(nums);

		int start = 0;
		int end = nums.length - 1;
		while (start < end) {

			int sum = nums[start] + nums[end];

			if (sum == target) {
				System.out.println(nums[start] + " " + nums[end]);

				while (start < end && nums[start] == nums[start + 1]) 
					start++;
				
				while (start < end && nums[end] == nums[end - 1]) 
					end--;
				
				start++;
				end--;
			} else if (sum > target) {
				end--;
			} else if (sum < target) {
				start++;
			}
		}
	}
}
