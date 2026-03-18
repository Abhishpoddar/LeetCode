package March;
public class Georgia {
//	238. Product of Array Except Self
//	🔗 Problem: Product of Array Except Self
//	Concept
//	Prefix + suffix product.
//	Idea
//	left[i]  = product of elements before i
//	right[i] = product of elements after i
//	answer[i] = left[i] * right[i]
//	Optimized solution uses O(1) extra space.
	private static int [] getResult(int [] nums) {

		int [] ans = new int[nums.length];
		
		ans[0]=1;
		for(int i=1 ; i<nums.length ; i++) {//for left side
			ans[i]= ans[i-1]*nums[i-1];
		}
		int suffix=1;
		for(int i=nums.length-2 ; i>=0 ; i--) {//For calculating the product
			suffix *=nums[i+1];
			ans[i]*=suffix;
		}
	return ans;		
	}
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,0};
		 nums =getResult(nums);
		 for(int num : nums) {
			 System.out.println(num);
		 }
	}
}
