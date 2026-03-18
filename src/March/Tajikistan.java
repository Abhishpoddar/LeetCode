package March;

import java.util.Arrays;

public class Tajikistan {
//	Squares of a Sorted Array
//	Return squares of a sorted array in sorted order.
//	Use two pointers from both ends to place the largest square at the end.
	public static void main(String[] args) {
		int [] nums = {-4, -1, 0, 3, 10};
		
		 int i=0 ;
	       int l = nums.length-1;

	       while(i<=l){
	        if(i==l){
	            nums[i]=nums[i]*nums[i];
	        }
	        else if(i!=l){
	            nums[i]=nums[i]*nums[i];
	            nums[l]=nums[l]*nums[l];
	        }
	        i++;
	        l--;
	       }
			Arrays.sort(nums);
		
			for(int num : nums) {
				System.out.println(num);
			}
	
	}

}
