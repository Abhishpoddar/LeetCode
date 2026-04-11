package April;
public class Bulgaria{
//	9. Palindrome Number
//	Input: x = 121
//	Output: true
	private static int getReverse(int num) {
		if(num>=0 && num<=9) {
			return num;
		}
		int revNumber=0;
		
		while(num!=0) {
			int temp = num%10;
			
			if(revNumber>Integer.MAX_VALUE/10 || revNumber<Integer.MIN_VALUE/10) 
				return 0;
			
			revNumber = revNumber*10+temp;
			num/=10;
		}
	return revNumber;		
	}
	private static boolean isPallindrome(int num) {
		 if(num<0) return false;
	     if(num>=0 && num<=9) return true;

	    int rev = getReverse(num);

	return rev==num;
	}
	public static void main(String[] args) {
		boolean result = isPallindrome(121);
		System.out.println(result);
	}
}