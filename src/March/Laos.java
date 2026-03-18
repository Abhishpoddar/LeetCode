package March;

import java.util.Arrays;

public class Laos {
	//977. Squares of a Sorted Array
	//Return squares of elements in sorted order.
	public static void main(String[] args) {
			int [] nums = {-4,-3,1,2,5};
			
			int i=0;
			int l=nums.length-1;
			
			while(i<=l) {
                if(i==l){
                    nums[i]=nums[i]*nums[i];
                }
                else{
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
