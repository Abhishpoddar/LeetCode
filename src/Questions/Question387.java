package Questions;

import java.util.*;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//Example 1:
//Input: s = "leetcode"
//Output: 0
public class Question387 {

	private static int getUnique(String str) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.get(ch) ==1) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		String str = "leetcode";
		
		System.out.println(getUnique(str));

	}

}
