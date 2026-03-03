package month1;

public class Thailand {
	// 125. Valid Palindrome
	private static boolean isPalindrome(String s) {
		s = s.toLowerCase();

		char[] ch = s.toCharArray();

		char[] ch2 = new char[ch.length];
		int j = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= '0' && ch[i] <= '9') {
				ch2[j++] = ch[i];
			}
		}
		char[] ch3 = new char[j];

		for (int k = 0; k < j; k++) {
			ch3[k] = ch2[k];
		}

		int f = 0;
		int l = ch3.length - 1;

		while (f < l) {
			if (ch3[f] != ch3[l]) {
				return false;
			}
			f++;
			l--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		boolean result = isPalindrome(s);
		
		System.out.println(result);
	}

}
