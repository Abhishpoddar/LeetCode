package March;
//303. Range Sum Query - Immutable
//Concept: Basic prefix sum array
//Idea Create a prefix array where
//prefix[i] = sum of elements from 0 → i
//Then: sum(l, r) = prefix[r] - prefix[l-1]
class NumArray {

	private int[] prefix;

	public NumArray(int[] nums) {
		this.prefix = new int[nums.length];
		prefix[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			prefix[i] = prefix[i - 1] + nums[i];
		}
	}

	public int sumRange(int left, int right) {
		if (left == 0) 
			return prefix[right];
		 else 
			return prefix[right] - prefix[left - 1];
	}
}
public class Japan {
	
	public static void main(String[] args) {
		int [] nums = {-2, 0, 3, -5, 2, -1};
		int [] range = {0,2};
		 NumArray obj = new NumArray(nums);
		 int param_1 = obj.sumRange(range[0],range[1]);
		 System.out.println(param_1); 
	}
}
