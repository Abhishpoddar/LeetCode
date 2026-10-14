package Questions;

import java.util.Arrays;
//922. Sort Array By Parity II
public class Question922 {
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4,5,6,7,8};
		
		int i=0 ;
		int j=1;
		
		while(i<nums.length && j<nums.length) {
			
			if(nums[i]%2==0) {
				i+=2;
			}
			else if(nums[j]%2!=0) {
				j+=2;
			}
			
			else {
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
