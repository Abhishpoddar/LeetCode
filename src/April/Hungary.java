package April;
public class Hungary {
//	2351. First Letter to Appear Twice
//	Input: s = "abccbaacz"
//	Output: "c"
	private static char repeatedCharacter(String str) {
		
        int [] count = new int[26];

        for(int i=0 ; i<str.length() ; i++){
            int index= str.charAt(i)-'a';
            count[index]++;
            
            if(count[index]==2) {
            	return str.charAt(i);
            }
        }
    return '\0';    
    }
	
	public static void main(String[] args) {
		
		String str = "abccbaacz";
		System.out.println(repeatedCharacter(str));
	}

}
