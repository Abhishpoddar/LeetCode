package April;
public class SierraLeone {
	// 520. Detect Capital
	private static boolean isUpper(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 'A' || str.charAt(i) > 'Z') 
				return false;
		}
		return true;
	}
	private static boolean isLower(String str) {
		for (int i = 0; i < str.length(); i++) 
			if (str.charAt(i) < 'a' || str.charAt(i) > 'z') {
				return false;
		}
		return true;
	}
	private static boolean detectCapitalUse(String word) {

		if (isUpper(word)) 
			return true;
			
		else if (isLower(word)) 
			return true;
	
		else if (isUpper(String.valueOf(word.charAt(0)))  && isLower(word.substring(1))) 
			return true;
		
	return false;
	}
	public static void main(String[] args) {
		String str = "FlaG";
		System.out.println(detectCapitalUse(str));
	}
}
