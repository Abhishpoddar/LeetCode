package March;

public class Germany {
//	153. Find Minimum in Rotated Sorted Array
//	Input: nums = [3,4,5,1,2] Output: 1
//	Input: nums = [4,5,6,7,0,1,2] Output: 0
	private static int findMin(int[] nums) {

		if (nums.length == 1) return nums[0];
		if (nums.length == 2) return nums[0] < nums[1] ? nums[0] : nums[1];

		int start = 0;
		int end = nums.length - 1;

		while (start < end) {

			int mid = start + (end - start) / 2;

			if (nums[mid] > nums[end])
				start = mid + 1;

			else
				end = mid;
		}
		return nums[start];
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };

		int num = findMin(nums);
		System.out.println(num);
	}

}
