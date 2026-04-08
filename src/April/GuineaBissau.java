package April;
import java.util.Arrays;
public class GuineaBissau {
	//1470. Shuffle the Array
	public static void main(String[] args) {
		int [] nums = {2,5,1,3,4,7};
		int n = 3;
		
		int [] result = new int [2*n];
		
		int j=0;
		for(int i=0 ; i<n ; i++) {
			result[j++]=nums[i];
			result[j++]=nums[i+n];
		}
		
		System.out.println(Arrays.toString(result));
	}

}
