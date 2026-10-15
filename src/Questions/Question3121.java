package Questions;

public class Question3121 {
	
	public static void main(String[] args) {
		
		String str = "aaAabcBbCc";
		
		boolean [] flag = new boolean[256];
		
		for(int i=0 ; i<str.length() ; i++) {
			
			flag[str.charAt(i)]=true;
		}
		
		int count=0;
		
		for(char i='a' ; i<='z' ; i++) {
			if(flag[i] && flag[i-32] && str.lastIndexOf(i)<str.indexOf(i-32)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
