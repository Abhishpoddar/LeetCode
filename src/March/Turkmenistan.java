package March;
import java.util.Arrays;
public class Turkmenistan {
//	3Sum Smaller
//	Count triplets where sum < target.
//	Use sorted array + two pointers to count multiple pairs efficiently.
//	nums = [-2,0,1,3]
//	target = 2
//	Output : 2
	public static void main(String[] args) {
		int [] nums = {-2,0,1,3};
		int target = 2;
	
		Arrays.sort(nums);
		int count=0;
		for(int i=0 ; i<nums.length-2 ; i++) {
			
			int left=i+1;
			int right=nums.length-1;
			
			while(left<right) {
				int sum= nums[i]+ nums[left]+nums[right];
				
				if(sum<target) {
					count+=(right-left);
					left++;	
				}
				else 
					right--;
			}
		}
		System.out.println(count);
	}
}
