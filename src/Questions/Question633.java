package Questions;
//633. Sum of Square Numbers
public class Question633 {
	
	private static boolean judgeSquareSum(int c) {
		
		int start=0;
		int end=(int)Math.sqrt(c);
		
		while(start<=end) {
			long prod = start*start+ end*end;
			
			if(prod==c) {
				
				System.out.println(start+" "+end);
				return true;
			}
			else if(prod<c) {
				start++;
			}
			else {
				end--;
			}
		}
     return false;  
    }

	public static void main(String[] args) {
		
		int num =100;
		
		System.out.println(judgeSquareSum(num));
		
	}

}
