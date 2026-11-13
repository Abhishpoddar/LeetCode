package Questions;
import java.util.*;
//2302. Count Subarrays With Score Less Than K
public class Question2302 {

	private static long getCount(int[] nums, long target) {
		
		long count = 0;
		long sum = 0;

		int start = 0;
		int end = 0;

		while (end < nums.length) {
			// Sum of subarray
			sum += nums[end];

			// length of subarray
			int length = end - start + 1;

			// Calculate the score
			long score = sum * length;

			while (start <= end && score >= target) {

				sum -= nums[start++];

				length = end - start + 1;

				score = sum * length;
			}
			count += end - start + 1;

			end++;
		}

		return count;
	}

	public static void main(String[] args) {

		int[] nums = new int[] { 2, 1, 4, 3, 5 };
		long k = 10L;
		System.out.println(getCount(nums, k));

	}

}
