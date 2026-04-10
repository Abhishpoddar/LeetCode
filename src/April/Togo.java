package April;
public class Togo {
	//367. Valid Perfect Square
	public static void main(String[] args) {
		
		int num = 16;
		
		long start=1;
		long end=num;
		
		while(start<=end) {
			long mid = start+(end-start)/2;
			
			long square = mid*mid;
			
			if(square==num) {
				System.out.println(mid);
				break;
			}
			else if(square<num) 
				start=mid+1;
	
			else 
				end=mid-1;
		}	
	}
}
