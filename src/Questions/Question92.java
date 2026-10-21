package Questions;

import java.util.*;
//90. Subsets II
public class Question92 {

	private static List<List<Integer>> subSets(int[] nums, int i, List<Integer> current, List<List<Integer>> list) {

		if (i == nums.length) {
			list.add(new ArrayList<>(current));
			return list;
		}

		current.add(nums[i]);

		subSets(nums, i + 1, current, list);

		current.removeLast();

		int idx = i + 1;

		while (idx < nums.length && nums[idx] == nums[idx - 1]) {
			idx++;
		}

		subSets(nums, idx, current, list);

		return list;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2};

		Arrays.sort(nums);

		List<List<Integer>> list = new ArrayList<>();

		List<Integer> current = new ArrayList<>();

		System.out.println(subSets(nums, 0, current, list));
	}

}
