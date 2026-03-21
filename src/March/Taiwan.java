package March;

public class Taiwan {
//	4. Count Subarrays with Product Less Than k
//	Problem:
//	Given an array of positive integers and an integer k, count the number of 
//	contiguous subarrays where the product of all elements is less than k.
//	Example Input: [10, 5, 2, 6], k = 100
//	Expected Output: 8

	private static int countSubArray(int[] nums, int k) {

		int count = 0;
		int start = 0;
		int end = 0;
		int pro = 1;

		while (end < nums.length) {
			pro *= nums[end];

			while (pro >= k && start <= end) {
				pro /= nums[start++];
			}
			count += end - start + 1;
			end++;
		}
		return count;

	}

	public static void main(String[] args) {

		int[] nums = { 10, 5, 2, 6 };
		int k = 100;

		int l = countSubArray(nums, k);
		System.out.println(l);
	}
	
}
