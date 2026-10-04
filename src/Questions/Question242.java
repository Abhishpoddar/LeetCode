package Questions;
//Anagram
public class Question242 {
	
	private static boolean isAnagram(String str1, String str2) {
		
		if(str1==null || str2==null) return false;
		if(str1.length()!=str2.length()) return false;

        int [] ana = new int [26];

        for(int i=0 ; i<str1.length() ; i++){
            ana[str1.charAt(i)-'a']++;
            ana[str2.charAt(i)-'a']--;
        }
        
        for(int count : ana) {
        	if(count!=0) {
        		return false;
        	}
        }
     return true;   
    }

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";
		
		System.out.println(isAnagram(str1.toLowerCase(), str2.toLowerCase()));	
	}
}
