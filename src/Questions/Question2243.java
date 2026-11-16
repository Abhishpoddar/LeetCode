package Questions;
//2243. Calculate Digit Sum of a String
public class Question2243 {
	
	private static int getCount(String str , int start , int end) {
		int sum=0;
		
		for(int i=start ; i<end ; i++) {
			sum+=str.charAt(i)-'0';
		}
	return sum;
	}
	
	private static String getSum(String str , int k) {
		int n=0;
		StringBuilder res = new StringBuilder();
        while(n+k<=str.length()){
        	
            res.append(getCount(str, n, n+k));
            n+=k;
        }
        
        if(n!=str.length()) {
        	res.append(getCount(str,n, str.length()));
        }
        
    return res.toString();    
    }
	
	
    public static String digitSum(String str, int k) {

        while(str.length()>k){
            str =  getSum(str, k); 
        }
     return str;   
    }
	public static void main(String[] args) {
		String str = "11111222223";
		int k=3;
		
		System.out.println(digitSum(str, k));
	}

}
