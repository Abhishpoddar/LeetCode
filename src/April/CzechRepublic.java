package April;
public class CzechRepublic {
//	242. Valid Anagram
//	Problem:Given two strings s and t, return true if t is an anagram of s, otherwise return false.
//  Example:Input: s = "listen", t = "silent"  Output: true
	private static boolean isAnagram(String s, String t) {

		if (s == null || t == null || s.length() != t.length())
			return false;

		int[] count = new int[26];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a']++;// Step 1: Count characters in s
			count[t.charAt(i) - 'a']--;// Step 2: Subtract counts using t
		}

		for (int k = 0; k < count.length; k++) {// Step 3: Check if all counts are zero
			if (count[k] != 0)
				return false;
		}
	return true;
	}

	public static void main(String[] args) {
		String s = "listen";
		String t = "silent";

		System.out.println(isAnagram(s, t));
	}	
}
