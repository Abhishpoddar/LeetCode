package Questions;
//153. Find Minimum in Rotated Sorted Array
public class Question153 {
	
	public static void main(String[] args) {
		
		int [] nums = {3,4,5,1,2};
		
		int start=0;
		int end=nums.length-1;
		
		while(start<end) {
			int mid = start+(end-start)/2;
			
			if(nums[mid]>nums[end]) {
				start=mid+1;
			}
			else {
				end=mid;
			}
		}
		
		System.out.println(end);
		
	}

}
