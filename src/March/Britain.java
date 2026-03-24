package March;
public class Britain {
//	LeetCode #1456 — Maximum Number of Vowels in a Substring of Given Length
//	Example 1: Input: s = "abciiidef", k = 3 Output: 3
//	Explanation: The substring "iii" contains 3 vowel letters.
//	Example 2: Input: s = "aeiou", k = 2 Output: 2
//	Explanation: Any substring of length 2 contains 2 vowels.
	private static int getMaxVowel(String str , int k) {
		
		str = str.toLowerCase();
		
		int currentLength=0;
		
		for(int i=0 ; i<k ; i++) {
			char ch = str.charAt(i);
			if("aeiou".contains(String.valueOf(ch))) {
				currentLength++;
			}
		}
		
		int maxLength=currentLength;
		
		for(int j=1 ; j<=str.length()-k ; j++) {
			
			char start = str.charAt(j-1);
			char end = str.charAt(j+k-1);
			
			if("aeiou".contains(String.valueOf(start))) 
				currentLength--;
			
			if("aeiou".contains(String.valueOf(end))) 
				currentLength++;
			 
			maxLength=Math.max(maxLength, currentLength);
		}
	return maxLength;	
	}
	
	public static void main(String[] args) {
		String str = "aeiou";
		int k=2;
		
		int maxVowel =getMaxVowel(str ,k);
		System.out.println(maxVowel);
	}

}
