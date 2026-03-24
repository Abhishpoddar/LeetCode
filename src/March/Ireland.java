package March;
public class Ireland {
//	 1176 : Diet Plan Performance
//	 Calculate points based on the sum of calories in a window of size k.
//	 Input: calories = [1, 2, 3, 4, 5], k = 1, lower = 3, upper = 3
//	 Output: 0
	private static int getPerformance(int [] nums , int k , int lower , int upper) {
		
		int pointer=0;
		int sum=0;
		
		for(int i=0 ; i<k ; i++) 
			sum+=nums[i];

		if(sum>upper) pointer++;
		else if(sum<lower) pointer--;
		
		
		for(int j=1 ; j<=nums.length-k ; j++) {
			sum += -nums[j-1]+nums[j+k-1];
			
			if(sum>upper) pointer++;
			else if(sum<lower) pointer--;
		}
	return pointer;		
	}
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5};
		int k=1 , lower=3 ,upper=3;
		
		int result = getPerformance(nums , k , lower, upper);
		System.out.println(result);
	}
}
