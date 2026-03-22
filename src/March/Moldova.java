package March;
public class Moldova {
//	162. Find Peak Element
//	Input: nums = [1,2,1,3,5,6,4] Output: 5
//	Explanation: Your function can return either index number 1 where the peak element is 2, 
//	or index number 5 where the peak element is 6.
	public static int findPeakElement(int[] nums) {
		
		if(nums.length==1) return 0;
		if(nums[0]>nums[1]) return 0;
		if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
		
		int start=1;
		int end=nums.length-1;
		
		while(start<=end) {
			int mid= start+(end-start)/2;
			
			if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) 
				return mid;
		
			if(nums[mid-1]<nums[mid]) 
				start=mid+1;
			
			else 
				end=mid-1;
		}
	return -1;	
	}
	public static void main(String[] args) {
		int [] nums = {1,2,1,3,5,6,4};
		
		int peak = findPeakElement(nums);
		System.out.println(peak);
	}
}
