package Questions;
//325.Longest Subarray with given Sum K(Positives)
public class Question325 {
	
	private static int getLongestSubAarray(int [] nums , int target) {
		int sum=0;
		int maxLength=Integer.MIN_VALUE;

		
		int start=0;
		int end=0;
		
		while(end<nums.length) {
			
			sum+=nums[end];
			
			while(sum>=target) {
				if(sum==target) {
					maxLength=Math.max(maxLength, end-start+1);	
				}
				sum-=nums[start++];
			}
			end++;
		}
	return maxLength==Integer.MIN_VALUE ? 0 : maxLength;	
	}
	
	public static void main(String[] args) {
		
		int [] nums = {10, 5, 2, 7, 1, 9};
		int target  = 15; 
		
		System.out.println(getLongestSubAarray(nums, target));	
	}

}
