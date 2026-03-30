package March;
import java.util.Arrays;
public class SanMarino {
	//Insertion Sort
	public static void main(String[] args) {
		int [] nums = {5,4,3,1,2};
		
		for(int i=1 ; i<nums.length ; i++) {
			int current=nums[i];
			int prev=i-1;
			
			while(prev>=0 && nums[prev]>current) {
				nums[prev+1]=nums[prev];
				prev--;
			}
			nums[prev+1]=current;
		}
		
		System.out.println(Arrays.toString(nums));
	}
}
