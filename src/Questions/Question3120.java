package Questions;

//3120. Count the Number of Special Characters I
public class Question3120 {

	public static void main(String[] args) {

		String str = "abcBAC";

		boolean[] flag = new boolean[256];

		for (int i = 0; i < str.length(); i++) {

			flag[str.charAt(i)] = true;
		}

		int count = 0;
		for (char i = 'a'; i <= 'z'; i++) {

			if (flag[i] && flag[i - 32]) {
				count++;
			}
		}

//		System.out.println(count);
//		String str = "abcABC";
//
//		boolean[] upper = new boolean[26];
//
//		boolean[] lower = new boolean[26];
//
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch >= 'A' && ch <= 'Z') {
//				upper[ch - 'A'] = true;
//			}
//
//			else {
//				lower[ch - 'a'] = true;
//			}
//		}
//
//		int count = 0;
//
//		for (int j = 0; j < 26; j++) {
//			if (upper[j] && lower[j]) {
//				count++;
//			}
//		}

		System.out.println(count);
	}

}
