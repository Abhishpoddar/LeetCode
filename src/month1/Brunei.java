package month1;

public class Brunei {
	//Fixed size sliding window
	//Maximum Average Subarray I
	//Find the maximum average of a subarray of size k using a fixed sliding window.
	
	private static double maximumAverage(int [] nums , int target) {
		
		int currentSum=0;
		for(int i=0 ; i<target ; i++) {
			currentSum += nums[i];
		}
		
		int maxSum=currentSum;
		
		for(int j=1 ; j<=nums.length-target ; j++) {
			currentSum += -nums[j-1]+ nums[j+target-1];
			maxSum = Math.max(currentSum,maxSum);
		}
	return maxSum/(target*1.0);	
		
	}
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,5,8,2};
		int k=3;
		
		double average =maximumAverage(nums , k);
		
		System.out.println(average);
		
	}

}
