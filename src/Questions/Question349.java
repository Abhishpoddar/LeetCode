package Questions;
import java.util.*;
//Example 1:
//
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
//Example 2:
//
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
public class Question349 {
	
	public static void main(String[] args) {
		
		int [] nums1 = {4,9,5};
		int [] nums2 = {9,4,9,8,4};
		
		Set<Integer> set = new HashSet<>();
		
		for(int el : nums1) {
			set.add(el);
		}
		
		Set<Integer> result = new HashSet<>();
		
		for(int el : nums2) {
			
			if(set.contains(el)) {
				result.add(el);
			}
			
		}
		
		int [] ret = new int [result.size()];
		
		int i=0;
		for(int el : result) {
			ret[i++]=el;
		}
		
		
		for(int el : ret) {
			System.out.println(el);
		}
		
	
		
	}

}
