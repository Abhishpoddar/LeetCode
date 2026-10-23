package Questions;
//1456. Maximum Number of Vowels in a Substring of Given Length
public class Question1456 {
	
	public static void main(String[] args) {
		
		String str = "abciiidef";
		int k=3;
		
		int currentLength=0;
		
		for(int i=0 ; i<k ; i++) {
			
			if("aeiou".contains(String.valueOf(str.charAt(i)))) {
				currentLength++;
			}
		}
		
		int countMax= currentLength;
		for(int i=1 ; i<str.length()-k+1 ; i++) {
			
			if("aeiou".contains(String.valueOf(str.charAt(i-1)))) {
				currentLength--;
			}
			
			if("aeiou".contains(String.valueOf(str.charAt(i+k-1)))) {
				currentLength++;
			}
			
			countMax=Math.max(countMax, currentLength);	
		}
		
		System.out.println(countMax);
	}

}
