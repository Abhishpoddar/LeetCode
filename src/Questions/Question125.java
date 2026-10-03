package Questions;

public class Question125 {
	
	private static boolean isAlphaNumeric(char ch) {
		
		if(ch>='A' && ch<='Z'  || ch>='a' && ch<='z' || ch >= '0' && ch <= '9') {
			return true;
		}
	return false;	
	}

	private static boolean isPallindrome(String str) {
		
		str = str.toLowerCase();

		int start = 0;
		int end = str.length()-1;

		while (start < end) {

			if (!isAlphaNumeric(str.charAt(start))) {
				start++;
				continue;
			}

			if (!isAlphaNumeric(str.charAt(end))) {
				end--;
				continue;
			}

			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			
			start++;
			end--;
		}
	return true;	
	}

	public static void main(String[] args) {

		String str = "Hello";
		
		System.out.println(isPallindrome(str));

	}

}
