package April;
import java.util.*;
public class Cameroon{
	//66. Plus One
	public static void main(String[] args) {
		int [] nums = {9,9,9};
		
		for(int i=nums.length-1 ; i>=0 ; i--) {
			if(nums[i]<9) {
				nums[i]++;
				System.out.println(Arrays.toString(nums));
				return;
			}
		}
		
		int [] result = new int [nums.length+1];
		result[0]=1;
		
		System.out.println(Arrays.toString(result));
	}
}
