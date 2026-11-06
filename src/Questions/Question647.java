package Questions;

public class Question647 {
	
	private static int expand(String str , int left , int right){
		
		int count=0;

        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right) ){
        	count++;
            left--;
            right++;
        }
    return count;  
    }

    public static int countSubstrings(String str) {

        int count=0;

        for(int i=0 ; i<str.length() ; i++){
            //For odd length pallindrome count
           count+=expand(str , i ,i);
           
           //For even length palindrome count
           count+=expand(str , i ,i+1);
        }
    return count;    
    }
	public static void main(String[] args) {
		
		String str = "fdsklf";
		
		System.out.println(countSubstrings(str));
		
		
	}

}
