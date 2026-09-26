package Questions;

import java.util.HashSet;
import java.util.Set;

//Longest Consecutive Subsequence
//Input:
//[1, 9, 3, 10, 2, 20]
//
//Output:
//3
public class Question128 {

	public static void main(String[] args) {

		int[] nums = { 1, 9, 3, 10, 2, 20 };

		int length = 0;

		Set<Integer> set = new HashSet<>();

		for (int el : nums) {
			set.add(el);
		}

		for (int el : set) {

			if (!set.contains(el - 1)) {
				int start = el;
				int count = 0;

				while (set.contains(start)) {
					count++;
					start++;
					length = Math.max(count, length);// 3
				}
			}
		}
		System.out.println("Maximum length is : " + length);
	}

}
