package Questions;
import java.util.*;
//2150. Find All Lonely Numbers in the Array
public class Question2150 {
	
	private static List<Integer> lonely(int [] nums){
		
		List<Integer>list = new ArrayList<>();
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int elem : nums) {
			if(map.containsKey(elem)) {
				map.put(elem, map.get(elem)+1);
			}
			else {
				map.put(elem, 1);
			}
		}
		
		
		for(int elem : nums) {
			if(map.get(elem)==1  && !map.containsKey(elem-1) && !map.containsKey(elem+1)) {
				list.add(elem);
			}
		}
			
	return list;
		
	}
	
	public static void main(String[] args) {
		
		int [] nums = {10,5,6,8};
		System.out.println(lonely(nums));
		
		
	}

}
