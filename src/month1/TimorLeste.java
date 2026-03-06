package month1;

public class TimorLeste {
	//Minimum Size Subarray Sum
	//Find the smallest subarray whose sum is ≥ target using variable window shrinking.
	//nums = [2, 3, 1, 2, 4, 3]  , target = 7
	
	private static int minSubarraySize(int [] nums , int target) {
		
		int start =0;
		int end=0;
		int length=Integer.MAX_VALUE;
		int sum=0;
		
		while(end<nums.length) {
			sum += nums[end];
			
			while(sum>=target) {
				length = Math.min(length,end-start+1);
				sum -= nums[start++];
			}
		end++;	
		}
	return length==Integer.MAX_VALUE ? 0 : length;	
		
	}
	
	public static void main(String[] args) {
		int [] nums = {2, 3, 1, 2, 4, 3};
		int target =7;
		
		int length = minSubarraySize(nums , target);
		
		System.out.println(length);	
	}


}
