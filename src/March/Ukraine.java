package March;

public class Ukraine {
//	852. Peak Index in a Mountain Array
//	Example 1:Input: arr = [0,1,0] Output: 1
//	Example 2:Input: arr = [0,2,1,0] Output: 1
	
	public static void main(String[] args) {
		int [] nums = {0,2,1,0};
		
		int start=1 ;
		int end=nums.length-1;
		
		int index=0;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]) {
				index=mid;
			}
			
			if(nums[mid-1]<nums[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
	System.out.println(index);
	}

}
