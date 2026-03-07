package month1;

public class Nkorea {
//	152.Maximum Product Subarray
//	Input:nums=[2,3,-2,4]Output:6 
//	Explanation:[2,3] has the largest product 6.

	public static  int maxProduct(int[] nums) {
		int maxPro = Integer.MIN_VALUE;

		int pro = 1;
		for (int i = 0; i < nums.length; i++) {
			pro *= nums[i];
			maxPro = Math.max(maxPro, pro);
			if (pro == 0) {
				pro = 1;
			}
		}
		pro = 1;
		for (int j = nums.length - 1; j >= 0; j--) {
			pro *= nums[j];
			maxPro = Math.max(maxPro, pro);
			if (pro == 0) {
				pro = 1;
			}
		}

		return maxPro;
	}

	public static void main(String[] args) {
		int [] nums = {2,3,-2,4};
		int k = maxProduct(nums);
		System.out.println(k);
	}
}
