package Questions;
//713. Subarray Product Less Than K
public class Question713 {
	
	public static void main(String[] args) {
		
		int [] nums = {10,5,2,6};
		
		int k=100;
		
		int start=0;
		int end=0;
		
		int prod=1;
		int length=0;
		
		while(end<nums.length) {
			
			prod*=nums[end];
			
			if(prod>=k  && start<=end) {
				prod/=nums[start++];
				
			}	
			length+=end-start+1;
			
			end++;
		}
		
		System.out.println(length);
	}

}
