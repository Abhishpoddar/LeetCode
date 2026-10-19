package Questions;

public class Question2264 {
	
	public static void main(String[] args) {
		
		String str = "222";
		
		String largest="";
		
		for(int i=0 ; i<str.length()-2 ; i++) {
			char ch = str.charAt(i);
			String current="";
			if(ch==str.charAt(i+1) && ch==str.charAt(i+2)) {
				
				current=str.substring(i,i+3);
				
				if(largest.isEmpty()) {
					largest=current;
				}
				
				if(ch>largest.charAt(0)) {
					largest=current;
				}
				
				if(ch=='9') {
					System.out.println(largest);
					return;
				}
			}
		}
		
		System.out.println(largest);
		
	}

}
