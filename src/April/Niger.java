package April;
import java.util.*;
public class Niger {
	//217. Contains Duplicate
	//Input: nums = [1,2,3,1]
	//Output: true
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,1};
		
		int duplicate=0;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0 ; i<nums.length ; i++) {
			if(set.contains(nums[i])) {
				duplicate=nums[i];
			}
			set.add(nums[i]);
		}
		System.out.println(duplicate);
	}
}
