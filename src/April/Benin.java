package April;
public class Benin {
	//633. Sum of Square Numbers
	public static void main(String[] args) {
		int num=63;
		
		long start=0;
		long end=(long)Math.sqrt(num);
		
		boolean isExist=false;
		
		while(start<=end) {
			
			long sum = start*start+end*end;
			
			if(sum==num) {
				isExist=true;
				break;
			}
			else if(sum<num) 
				start++;
			
			else 
				end--;	
		}
		System.out.println(isExist);
	}
}
