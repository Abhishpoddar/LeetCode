package Questions;

import java.util.*;
//39. Combination Sum
public class Question39 {
	
	private static List<List<Integer>> getCombinations(int [] nums , int target , int i , List<Integer>current , List<List<Integer>>list, Set<List<Integer>>set){
		if(target<0 || i==nums.length) {
			return list;
		}
		
		if(target==0) {
			
			if(!set.contains(current)) {
				set.add(new ArrayList<>(current));
				list.add(new ArrayList<>(current));
			}
			
		return list;
		}
		
		current.add(nums[i]);
		getCombinations(nums, target-nums[i], i+1, current, list, set);//Only when we use elem one time
		
		
		getCombinations(nums, target-nums[i], i, current, list, set);//When we are using same elem for multiple time
		
		current.removeLast();
		
		getCombinations(nums, target, i+1, current, list, set);//When we are ignoring the current element
		
		
		
	return list;	
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> current = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		
		Set<List<Integer>> set = new HashSet<>();
		
		return getCombinations(candidates, target,0, current, list, set);
	}

	public static void main(String[] args) {
		
		int [] nums = {2,3,5};
		int target=8;
		
		System.out.println(combinationSum(nums, target));
	}

}
