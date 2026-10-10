package Questions;
//9. Palindrome Number
public class Question9 {
	
	public static int reverse(int num) {

		if (num == 0 || num == 1)
			return num;

		int rev = 0;

		do {
			int temp = num % 10;

			if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
				return 0;
			}
			rev = rev * 10 + temp;
			num /= 10;
		} while (num != 0);

		return rev;
	}

	public static boolean isPalindrome(int num) {

		if (num < 0)
			return false;

		return num == reverse(num);
	}

	public static void main(String[] args) {
		int num = -121;
		System.out.println(isPalindrome(num));
	}

}
