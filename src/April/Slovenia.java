package April;
public class Slovenia {
	//567. Permutation in String
	//Input: s1 = "ab", s2 = "eidbaooo"
	//Output: true
	private static boolean isFreqEqual(int [] a , int [] b) {
		for(int i=0 ; i<26 ; i++) {
			if(a[i]!=b[i]) 
				return false;	
		}
	return true;	
	}
	private static boolean isPermutationExist(String s1 , String s2) {
		
		int [] count = new int [26];
		for(int i=0 ; i<s1.length() ; i++) 
			count[s1.charAt(i)-'a']++;
		
		for(int j=0 ; j<s2.length() ; j++) {
			int windowIndex=0 , index=j;
			int [] window = new int [26];
			
			while(index<s2.length() && windowIndex<s1.length()) {
				window[s2.charAt(index)-'a']++;
				windowIndex++;
				index++;	
			}
			
			if(isFreqEqual(count ,window)) 
				return true;
		}
	return true;	
	}
	public static void main(String[] args) {
		String s1="ab";
		String s2="eidbaooo";
		
		System.out.println(isPermutationExist(s1,s2));
	}
}
