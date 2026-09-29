package Questions;
//Count Occurrences
//Using binary search, count how many times a target appears.
//Example: [1, 2, 2, 2, 4], target 2 → 3
public class Question34 {
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,2,2,4};
		int target=2;
		
		int start=0;
		int end=nums.length-1;
		
		int first=-1;
		int last=-1;
		
		
		while(start<=end) {//First occurence
			int mid = start+(end-start)/2;
			
			if(target==nums[mid]) {
				first=mid;
				end=mid-1;
			}
			
			else if(target<nums[mid]) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}
		}
		
		
		start=0;
		end=nums.length-1;
		
		while(start<=end) {//last occurence
			int mid = start+(end-start)/2;
			
			if(target==nums[mid]) {
				last=mid;
				start=mid+1;
			}
			
			else if(target<nums[mid]) {
				end=mid-1;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}
		}
		
		System.out.println(first+" . "+last);
	}

}
