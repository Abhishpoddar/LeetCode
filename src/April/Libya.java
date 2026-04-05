package April;
import java.util.*;
public class Libya {
	//167. Two Sum II - Input Array Is Sorted
	//Input: numbers = [2,7,11,15], target = 9
	//Output: [1,2]
	public static int[] twoSum(int[] nums, int target) {

        int start=0;
        int end= nums.length-1;

        while(start<=end){
            int sum = nums[start]+nums[end];

            if(target==sum)
                return new int[]{start+1,end+1};
            
            else if(target>sum)
                start++;
            
            else
                end--;
        }
    return new int[]{-1,-1};    
    }
	public static void main(String[] args) {
		int [] nums = {2,7,9,11};
		int target=9;
		
		int [] result = twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}