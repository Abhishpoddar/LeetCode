package Questions;

import java.util.Arrays;
//189. Rotate Array
public class Question189 {
	
	private static void getReverse(int [] nums , int i , int j) {
		
		while(i<=j) {
			int temp=nums[i];
			nums[i++]=nums[j];
			nums[j--]=temp;
		}
	}

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		
		int k=3;
		
		k=k%nums.length;
		
		getReverse(nums, 0, nums.length-1);
		
		getReverse(nums , 0 , k-1);
		
		getReverse(nums, k, nums.length-1);
		
		System.out.println(Arrays.toString(nums));
		
		

	}

}
