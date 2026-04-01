package March;
public class Switzerland {
	//Check valid Palindrome 
	private static boolean isAlphaNumeric(char ch) {
		if(ch>='a' && ch<='z'||ch>'0' && ch<='9') {
			return true;
		} 
	return false;
	}
	private static boolean isValidPallindrome(String str) {
		
		str=str.toLowerCase();
		
		int start=0;
		int end=str.length()-1;
		
		while(start<end) {
			
			if(!isAlphaNumeric(str.charAt(start))) { start++; continue;}
			if(!isAlphaNumeric(str.charAt(end))) {end--; continue;}
			
			if(str.charAt(start)!=str.charAt(end)) 
				return false;
			
		start++;
		end--;
		}
	return true;	
	}
	
	public static void main(String[] args) {
		String str = "ra%ceca$r";
		System.out.println(isValidPallindrome(str));	
	}
}
