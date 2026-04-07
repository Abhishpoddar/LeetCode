package April;
import java.util.*;
public class Chad {
	private static  int findDuplicate(int[] nums) {

        int duplicate=-1;
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=0 ; i<nums.length ; i++) {
        	
        	if(set.contains(nums[i])) {
        		duplicate=nums[i];
        	}
        	
        	set.add(nums[i]);
        }
    return duplicate;  
    }
	public static void main(String[] args) {
		int [] nums = {1,3,4,2,2};
		
		System.out.println(findDuplicate(nums));
	}
}
