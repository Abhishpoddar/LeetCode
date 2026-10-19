package Questions;
//796. Rotate String
public class Question796 {
	
	public static void main(String[] args) {
		
		String str="ABCD";
		String str2="CDAB";
		
		str+=str;//ABCDABCD
		
		for(int i=0 ; i<str.length() ; i++) {
			
			int index=i;
			int j=0;
			
			while(index<str.length()  && j <str2.length() ) {
				if(str.charAt(index)==str2.charAt(j)) {
					index++;
					j++;
				}
				else {
					break;
				}
				
				if(j==str2.length()) {
					System.out.println(true);
					return;
				}
			}
		}
		System.out.println(false);
	}

}
