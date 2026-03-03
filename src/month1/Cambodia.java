package month1;

public class Cambodia {
	//344 – Reverse String
	
	public static void main(String[] args) {
		char[] s = {'H','E','E','L','O'};
		 int i=0;
	        int l = s.length-1;

	        while(i<l){
	            char temp = s[i];
	            s[i]=s[l];
	            s[l]=temp;

	            i++;
	            l--;
	        }
	        
	        for(char ch : s) {
	        	System.out.println(ch);
	        }
	}

}
