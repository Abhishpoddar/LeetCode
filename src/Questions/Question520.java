package Questions;
//520. Detect Capital
public class Question520 {

	private static boolean isCorrectWord(String str) {

		int countUpper = 0;
		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				countUpper++;
			}
		}

		return countUpper == 0// All are lower case
				|| countUpper == 1 && Character.isUpperCase(str.charAt(0)) //Only first letter uppercase
				|| countUpper == str.length() ? //All letter upper case
					   true: false;
	}

	public static void main(String[] args) {
		String str = "Leetcode";

		System.out.println(isCorrectWord(str));
	}
}
