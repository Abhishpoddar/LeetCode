package Questions;

import java.util.Arrays;

//75. Sort Colors
public class Question75 {
	
	public static void main(String[] args) {
		
		int [] nums = {2,0,2,1,1,0};
		
		int start=0;
		int mid=0;
		int end=nums.length-1;
		
		while(mid<=end) {
			if(nums[mid]==0) {
				int temp = nums[mid];
				nums[mid++]=nums[start];
				nums[start++]=temp;
			}
			
			else if(nums[mid]==1) {
				mid++;
			}
			else if(nums[mid]==2) {
				int temp = nums[mid];
				nums[mid]=nums[end];
				nums[end--]=temp;
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

}
