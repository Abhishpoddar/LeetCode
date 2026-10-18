package Questions;
import java.util.*;
//78. Subsets
public class Question78 {
	
	private static void subset(int [] nums ,  int start , List<Integer> currentList , List<List<Integer>> list) {
		
		list.add(new ArrayList<>(currentList));
		
		for(int i=start ; i<nums.length ; i++) {
			//Add
			currentList.add(nums[i]);
			//Explore
			subset(nums, i+1 , currentList, list);
			//BackTrack
			currentList.removeLast();
		}
	}

	public static List<List<Integer>> subsets(int[] nums) {
		
		List<List<Integer>> list= new LinkedList<>();
		
		subset(nums , 0 , new ArrayList<>() , list);

		return list;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		
		List<List<Integer>>list = subsets(nums);
		System.out.println(list);

	}

}
