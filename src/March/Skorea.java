package March;

public class Skorea {
//	5. Search in Rotated Sorted Array
//	Given a rotated sorted array
//	arr = [15, 18, 2, 3, 6, 12]
//	Use binary search to find the index of element 3.
	public static void main(String[] args) {
		int [] nums = {15, 18, 2, 3, 6, 12};
		int target=12;
		int start=0;
		int end=nums.length-1;
		int index=0;
		
		while(start<=end) {
			int mid = start+ (end-start)/2;
			
			if(nums[mid]==target) {
				index=mid;
			}
			if(nums[start]<=nums[mid]) {
				if(nums[start]<=target && target<=nums[mid]) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
			else if(nums[mid]<=nums[end]) {
				if(nums[mid]<=target && target<=nums[end]) {
					start = mid+1;
				}
				else {
					end= mid-1;
				}
			}
		}
		System.out.println(index);
		
		
	}

}
