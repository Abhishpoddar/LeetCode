package Questions;

//Expand around center approach
public class Question5 {

	private static int expand(String str, int left, int right) {

		while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

	public static void main(String[] args) {

		String str = "babab";

		int start = 0;
		int maxLen = 0;

		String res = "";

		for (int i = 0; i < str.length(); i++) {

			// For odd length
			int lenOdd = expand(str, i, i);

			// For even Length
			int lenEven = expand(str, i, i + 1);

			int len = Math.max(lenOdd, lenEven);

			if (len > maxLen) {
				maxLen = len;

				start = i - (maxLen - 1) / 2;
				res = str.substring(start, start + maxLen);
			}

		}

		System.out.println(res);
	}

}
