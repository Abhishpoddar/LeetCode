package Questions;
import java.util.Arrays;
//1929. Concatenation of Array
public class Question1929 {
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,3};
		
		int [] result = new int [nums.length*2];
		
		for(int i=0 ; i<result.length ; i++) {
			result[i]=nums[i%nums.length];
		}	
		
		System.out.println(Arrays.toString(result));
	}

}
