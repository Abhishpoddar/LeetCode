package Questions;
//680. Valid Palindrome II
public class Question680 {
	
	private static boolean checkPalindrome(String str, int start, int end) {

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    public static boolean validPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return checkPalindrome(str, start + 1, end) ||
                       checkPalindrome(str, start, end - 1);
            }

            start++;
            end--;
        }
        return true;
    }
		
		public static void main(String[] args) {
			
			String str = "Abca";
			
			System.out.println(validPalindrome(str));
		}


}
