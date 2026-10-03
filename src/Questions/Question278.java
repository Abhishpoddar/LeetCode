package Questions;

public class Question278 {
	
	private static boolean isBadVersion(int badVersion) {
		
		int firstBad=4;
		
	return badVersion==firstBad;	
	}
	
	 public static int firstBadVersion(int n) {

	        int start=1;
	        int end=n;//5   bad=4

	        while(start<=end){
	            int mid = start+(end-start)/2;

	            if(isBadVersion(mid)){
	                end=mid-1;
	            }
	            else{
	                start=mid+1;
	            }
	        }
	    return start;    
	    }
	
	public static void main(String[] args) {
		int n=5;
		
		System.out.println(firstBadVersion(n));
	}

}
