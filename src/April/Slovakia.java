package April;
public class Slovakia {
//	387. First Unique Character in a String
//	Find the first non-repeating character using frequency count.
//	s = "leetcode"
//	Output: Index: 0 (character 'l')
	private static int firstUniqChar(String str) {

		int[] count = new int[26];

		for (int i = 0; i < str.length(); i++) 
			count[str.charAt(i) - 'a']++;

		int index = -1;

		for (int j = 0; j < str.length(); j++) {
			if (count[str.charAt(j) - 'a'] == 1) {
				index = j;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {

		String str = "leetcode";
		System.out.println("Index is : "+firstUniqChar(str));
	}
}
