package Questions;
//1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
public class Question1343 {
	
	public static void main(String[] args) {
		
		int [] nums = {2,2,2,2,5,5,5,8};
		
		int k=3;
		
		int threshold=4;
		
		
		int count=0;
		
		int current=0;
		
		for(int i=0 ; i<k ; i++) {
			current+=nums[i];
		}
		
		if(current>=k*threshold) {
			count++;
		}
		
		for(int i=1 ; i<nums.length-k+1 ; i++) {
			
			current+= -nums[i-1]+nums[i+k-1];
			
			if(current>=k*threshold) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
