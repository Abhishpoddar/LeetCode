package March;

public class Belgium {
//	34. Find First and Last Position of Element in Sorted Array
//	Example 1: Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
//	Example 2: Input: nums = [5,7,7,8,8,10], target = 6 Output: [-1,-1]
	public static int[] searchRange(int[] nums, int target) {

		int start=0;
		int end=nums.length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(nums[mid]==target) {
				 int first=mid;
				 int last=mid;
				
				while(first>0 && nums[first]==nums[first-1]) 
						first--;	
				
				while(last<nums.length-1 && nums[last]==nums[last+1]) 
						last++;
				
			return new int [] {first,last};
			}
			
			if(nums[mid]>target) 
				end=mid-1;
			
			else 
				start=mid+1;
		}
	return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		
		int [] result = searchRange(nums , target);
		System.out.println(result[0]+" "+result[1]);
	}

}
