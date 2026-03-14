package month1;

public class Norway {
//	Reverse String
//	Reverse a character array in-place.
//	Swap characters using two pointers
	
	public static void main(String[] args) {
		String s = "hello world";
		
		char [] ch = s.toCharArray();
		
		int i=0;
		int j = s.length()-1;
		
		while(i<j) {
			char temp = ch[i];
			ch[i++]=ch[j];
			ch[j--]=temp;
		}
		
		s= new String(ch);
		System.out.println(s);
	}

}
