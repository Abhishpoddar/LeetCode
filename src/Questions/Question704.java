package Questions;
//Search in a sorted array
public class Question704 {
	
	private static int search(int[] nums, int target, int start, int end) {

		if (start <= end) {
			int mid = start + (end - start) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] <= target) {
				return search(nums, target, mid+1, end);
			} else {
				return search(nums, target, start, mid - 1);
			}
		
		}
	return-1;	
	}
	
	 private static int binarySearch(int[] nums, int target) {

	        int start=0;
	        int end= nums.length-1;

	        while(start<=end){
	            int mid = start+(end-start)/2;

	            if(target>nums[mid])
	                start= mid+1;
	            
	            else if(target<nums[mid])
	                end=mid-1;
	            
	            else
	                return mid; 
	        }
	    return -1;    
	    }
	
	public static void main(String[] args) {
		
		int [] nums = {-1,0,3,5,9,12};
		int target=9;
		
		int start=0;
		int end=nums.length-1;
		
		System.out.println(search(nums,target, start , end));
		System.out.println(binarySearch(nums, target));
	}

}
