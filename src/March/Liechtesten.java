package March;
import java.util.Arrays;
public class Liechtesten {
//	977. Squares of a Sorted Array
//	Example 1: Input: nums = [-4,-1,0,3,10]
//	Output: [0,1,9,16,100]
	public static void main(String[] args) {
		int [] nums = {-4,-1,0,3,10};
		
		//Step 1 :- Square
		for(int i=0 ; i<nums.length ; i++) 
			nums[i]=nums[i]*nums[i];
		
		int i=0 ; 
		int l=nums.length-1;
		
		int k=nums.length-1;
		int [] result = new int [nums.length];
		
		//Step 2 : compare and sort
		while(i<=l) {
			if(nums[i]<=nums[l]) 
				result[k--]=nums[l--];
		
			else 
				result[k--]=nums[i++];
		}
		
		//Step 3 :- Check the output
		System.out.println(Arrays.toString(result));
	}
}
