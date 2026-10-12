package Questions;
import java.util.*;
//1394. Find Lucky Integer in an Array
public class Question1394 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 3, 3 };
		
		
		int [] array = new int[501];
		
		for(int i=0 ; i<nums.length ; i++) {
			array[nums[i]]++;
		}
		
		for(int i=array.length-1 ; i>=1 ; i--) {
			if(i==array[i]) {
				System.out.println(i);
				return;
			}	
		}
		
		System.out.println(-1);
		
		
		
//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int elem : nums) {
//			if (map.containsKey(elem)) {
//				map.put(elem, map.get(elem) + 1);
//			} else {
//				map.put(elem, 1);
//			}
//		}
//		
//		int luckyNumber=-1;
//		
//		for(Map.Entry<Integer , Integer> entry : map.entrySet()){
//			int key=entry.getKey();
//			int value=entry.getValue();
//			
//			if(key==value) {
//				luckyNumber = Math.max(key, luckyNumber);	
//			}
//		}
//		
//		System.out.println(luckyNumber);

	}

}
