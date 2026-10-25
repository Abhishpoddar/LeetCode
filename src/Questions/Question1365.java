package Questions;

import java.util.Arrays;
//1365. How Many Numbers Are Smaller Than the Current Number
public class Question1365 {
	
	public static void main(String[] args) {
		
		int [] nums = {8,1,2,2,3};
		
		int [] number=new int [501];
		
		for(int i=0 ; i<nums.length ; i++) {
			number[nums[i]]++;
		}
		
		for(int i=1 ; i<number.length ; i++) {
			number[i]+=number[i-1];
		}
		
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]==0) {
				nums[i]=0;
			}
			else {
				nums[i]=number[nums[i]-1];
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

}
