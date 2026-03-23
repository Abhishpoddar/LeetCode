package March;
public class Poland {
//	540. Single Element in a Sorted Array
//	Example 1: Input: nums = [1,1,2,3,3,4,4,8,8] Output: 2
//	Example 2: Input: nums = [3,3,7,7,10,11,11] Output: 10
	public static int getSingleNonDuplicate(int[] nums) {
		
		if(nums.length==1) return nums[0];
		if(nums[0]!=nums[1]) return nums[0];
		if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
		
		int start=1;
		int end= nums.length-2;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(nums[mid-1]!= nums[mid] && nums[mid]!=nums[mid+1]) 
				return nums[mid];
			
			if(mid%2==0) {
				if(nums[mid-1]==nums[mid]) 
					end=mid-1;
				
				else 
					start=mid+1;
			}
			else {
				if(nums[mid-1]==nums[mid]) 
					start = mid+1;
				
				else 
					end=mid-1;
			}
		}
	return -1;	
	}
	public static void main(String[] args) {
		int [] nums = {1,1,2,3,3,4,4,8,8};
		
		int num = getSingleNonDuplicate(nums);
		System.out.println(num);
	}

}
