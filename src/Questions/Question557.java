package Questions;
//Question : 557
//Example 1:
//
//Input: s = "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
public class Question557 {
	
	private static String getReverse(String str , int start ,int end) {
		
		String res="";
		
		for(int i=end-1 ; i>=start ; i--) {
			res = res+ str.charAt(i);
		}
	return res;	
	}
	
	public static void main(String[] args) {
		
		String str = "Let's take LeetCode contest";
		
		int start=0;
		int end=0;
		
		String rev="";
		
		while(end<str.length()) {
			
			if(str.charAt(end)==' ') {
				rev = rev + getReverse(str , start , end)+" ";
				start=end+1;
			}
			end++;
		}
		
		rev = rev + getReverse(str, start, end);
		
		System.out.println(str);
		System.out.println(rev);
		
	}

	

}
