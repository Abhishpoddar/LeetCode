package Questions;

public class Question69 {
	
	private static int mySqrt(int x) {

		 if(x<2) return x;

	       int start=0;
	       int end=x/2;

	int count=0;
	        while(start<=end){
	            int mid = start+(end-start)/2;
	            
	             long prod= (long)mid*mid;

	            if(prod<=x){
	                count=mid;
	                start=mid+1;
	            }
	            else {
	                end=mid-1;
	            }
	        }
	    return count;   
    }
	
	public static void main(String[] args) {
		
		int num = 2147395599;
		
		System.out.println(mySqrt(num));
	}

}
