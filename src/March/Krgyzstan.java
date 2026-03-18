package March;
import java.util.Arrays;
public class Krgyzstan {
//	4️⃣ 3Sum
//	Find all unique triplets that sum to zero.
//	Sort array and apply two-pointer pair sum inside a loop.
	public static void main(String[] args) {
		int [] nums = {-1,0,1,2,-1,-4};
		Arrays.sort(nums);
		
		for(int i=0 ; i<nums.length ; i++) {
			if(i>0 && nums[i]==nums[i-1]) 
				continue;
			
			int left=i+1;
			int right = nums.length-1;
			
			while(left<right) {
				int sum = nums[i]+nums[left]+nums[right];
				
				if(sum==0) {
					System.out.println(nums[i]+" "+nums[left]+" "+nums[right]);
			
					while(left<right && nums[left]==nums[left+1]) 
						left++;
					
					while(left<right && nums[right]==nums[right-1]) 
						right--;
					
				left++;
				right--;
				}		
				else if(sum>0) 
					right--;
			
				else 
					left++;	
			}
		}
	}
}
