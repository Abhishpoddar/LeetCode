package March;

public class China{
//	2. Longest Substring Without Repeating Characters
//	Problem:
//	Given a string, find the length of the longest substring without repeating characters.
//	Example Input: "abcabcbb"
//	Expected Output: 3 (substring "abc")

	public static void main(String[] args) {
		String str = "abcabcbb";

		boolean[] count = new boolean[256];

		int first = 0;
		int second = 0;
		int length = 0;

		while (second < str.length()) {
			while (count[str.charAt(second)]) {
				count[str.charAt(first++)] = false;
			}
			count[str.charAt(second)] = true;
			length = Math.max(length, second - first + 1);
			second++;
		}
		System.out.println(length);
	}
}
