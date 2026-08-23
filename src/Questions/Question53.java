package Questions;

public class Question53 {
	//Max Subarray Sum
	
	int [] nums = {3,-4,5,4,-1,7,-8};
	int maxSum=Integer.MIN_VALUE;
	int currentSum=0;
	for(int i=0 ; i<nums.length ; i++) {
		currentSum+=nums[i];
		maxSum=Math.max(maxSum, currentSum);
		if(currentSum<0) {
			currentSum=0;
		}
	}
	System.out.println(maxSum);

}
