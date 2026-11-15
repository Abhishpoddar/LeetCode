package Questions;
//1524. Number of Sub-arrays With Odd Sum
import java.util.*;
public class Question1524 {

	private static int numOfSubarrays(int[] nums) {
		
		int count=0;
		
		int m= 1000000007;
		int sum=0;
		int even=1;
		int odd=0;
		
		
		for(int i=0 ; i<nums.length ; i++) {
			sum+=nums[i];
			
			if(sum%2==0) {
				count = (count+odd)%m;
				even++;
			}
			
			else {
				count = (count+even)%m;
				odd++;
			}
		}
	return count;	
	}

		

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5 };
		System.out.println(numOfSubarrays(nums));

	}

}
