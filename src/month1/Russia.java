package month1;
public class Russia {
//	Valid Palindrome
//	Check if a string is a palindrome after removing non-alphanumeric characters.
//	Use two pointers from start and end.
//	Original string: "A man, a plan, a canal: Panama"
	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";
		str = str.toLowerCase();
		
		int left=0;
		int right=str.length()-1;
		boolean flag =true;
	
		while(left<right) {
			while(left<right && !Character.isLetterOrDigit(str.charAt(left))) 
				left++;
				
			while(left<right && !Character.isLetterOrDigit(str.charAt(right))) 
				right--;
			
			if(str.charAt(left)!=str.charAt(right)) {
				flag =false;
				break;
			}
			else {
				left++;
				right--;
			}
			
		}
		System.out.println(flag);		
	}
}
