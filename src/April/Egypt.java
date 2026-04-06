package April;
import java.util.*;
public class Egypt {
//	7️⃣ Count Number of Pairs With Absolute Difference K
//	Use two pointers or hashmap depending on constraints.
//	nums = [1,2,2,1] k = 1
//	Output 4
	public static void main(String[] args) {
		int [] nums = {1,2,2,1};
		int k=1;
		
		Map<Integer , Integer> map = new HashMap<>();
		
		int count =0;
		for(int i=0 ; i<nums.length ; i++) {
			
			if(map.containsKey(nums[i]+k)) 
				count += map.get(nums[i]+k);
			
			if(map.containsKey(nums[i]-k)) 
				count+= map.get(nums[i]-k);
			
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		System.out.println(count);
	}
}
