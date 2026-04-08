package April;
public class Mali {
	//709. To Lower Case
	private static String toLowerCase(String str) {
		
		if(str==null || str.length()==0) 
			return str;
		
		String res = "";
		for(int i=0 ; i<str.length() ; i++) {
			
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') 
				res += (char)(str.charAt(i)-'A'+'a');
			
			else 
				res +=str.charAt(i);
		}
	return res;
	}

	public static void main(String[] args) {
		String str = "Leetcode";

		System.out.println(toLowerCase(str));	
	}
}
