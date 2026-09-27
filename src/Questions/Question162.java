package Questions;
//Peak element in a array
public class Question162 {
	
	private static int findPeakElement(int[] nums) {
		
		if(nums.length==1) return 0;
		if(nums[0]>nums[1]) return 0;
		if(nums[nums.length-1]>nums[nums.length-2]) return nums.length;
		
		int start=1;
		int end=nums.length-2;
		
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
				return mid;
			}
			
			if(nums[mid-1]<nums[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}	
		}
	return -1;	
	}

	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4,5,4,3,2};
		
		System.out.println(findPeakElement(nums));
	}
}
