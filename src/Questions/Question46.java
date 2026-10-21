package Questions;

import java.util.*;

//46. Permutations
public class Question46 {

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

	}

	private static List<List<Integer>> permute(int[] nums, int idx, List<List<Integer>> list) {
		if (idx == nums.length) {

			List<Integer> permutation = new ArrayList<>();
			for (int num : nums) {
				permutation.add(num);
			}
			list.add(new ArrayList<>(permutation));
			return list;
		}
		
		
		for (int i = idx; i < nums.length; i++) {
			swap(nums, i, idx);// Permute
			permute(nums, idx + 1, list);// Explore
			swap(nums, i, idx);// Backtrack return to original position
		}
		return list;
	}

	public static void main(String[] args) {
		
		int [] nums = {1,2,3};
		
		List<List<Integer>> list = new ArrayList<>();
		
		System.out.println(permute(nums, 0, list));


	}

}
