package April;
import java.util.Arrays;
public class Gambia {
	//1929. Concatenation of Array
	 private static  int[] getConcatenation(int[] nums) {
		 
		 int n = nums.length;
		 
		 int [] result = new int [2*n];
		 
		 for(int i=0 ; i<n ; i++) {
			 result[i]=nums[i];
			 result[i+n]=nums[i];
		 }
	 return result; 
	 }
	
	public static void main(String[] args) {
		int [] nums = {1,2,1};
		
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}
}
