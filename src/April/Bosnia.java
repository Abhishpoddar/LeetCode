package April;
public class Bosnia {
//	151. Reverse Words in a String
//	Input: s = "the sky is blue"
//	Output: "blue is sky the"
	private static String getReverse(String str) {
		String res = "";
		for(int i=0 ; i<str.length() ; i++) {
			res = str.charAt(i)+res;
		}
	return res;	
	}
	
	private static String getRevserse(String str) {
		if(str.equals(null) || str.length()==0) 
			return str;
		
		String res="";
		
		int i=0;
		while(i<str.length()) {
			
			while(i<str.length() && str.charAt(i)==' ') {
				i++;
			}
			
			String w="";
			while(i<str.length() && str.charAt(i)!=' ') {
				w = str.charAt(i) +w;
				i++;
			}
			
			if(!w.equals("")) 
				res +=" "+w;
		}
		res = getReverse(res);
	
	return res.substring(0,res.length()-1);
	}
	
	public static void main(String[] args) {
		String str = " the sky is blue";
		
		str = getRevserse(str);
		System.out.println(str);
	}
}
