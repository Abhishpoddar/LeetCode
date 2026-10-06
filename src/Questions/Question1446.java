package Questions;
//1446. Consecutive Characters
public class Question1446 {

	public static void main(String[] args) {
		String s ="leetcode";

		 int maxLength=1;
	        int count=1;
	        int i=1;

	        while(i<s.length()){
	            if(s.charAt(i-1)==s.charAt(i)){
	                count++;
	                maxLength=Math.max(maxLength,count);
	            }
	            else{
	                count=1;
	            }
	        i++;    
	        }
	    System.out.println(maxLength);

	}
}
