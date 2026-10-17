package Oct17;

public class Question2348 {
	
	public static void main(String[] args) {
		
		int [] nums = {0,0,0,2,0,0};
		
		 int count=0;
			
			for(int i=0 ; i<nums.length ; i++) {
				
				int n=0;
				
				while( i<nums.length && nums[i]==0) {
					n++;
					count+=n;
					i++;
				}
			}    
		
		System.out.println(count);
	}

}
