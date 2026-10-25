package Questions;
import java.util.Arrays;
//1470. Shuffle the Array
public class Question1470 {
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4,5,6};
		
		int n =3;
		
		int [] result = new int[nums.length];
		
		int j=0;
		for(int i=0 ; i<n ; i++) {
			result[j++]=nums[i];
			result[j++]=nums[i+n];
		}
		
		System.out.println(Arrays.toString(result));
	}

}
