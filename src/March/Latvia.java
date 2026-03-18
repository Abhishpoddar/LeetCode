package March;

public class Latvia {
//	122. Best Time to Buy and Sell Stock II
//	Input: prices = [7,1,5,3,6,4]
//	Output: 7
//	Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//	Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//	Total profit is 4 + 3 = 7.
	public static void main(String[] args) {
		int [] nums = {7,1,5,3,6,4};
		
		int profit=0;
		
		for(int i=1 ; i<nums.length ; i++) {
			if(nums[i]>nums[i-1]) {
				profit += nums[i]-nums[i-1];
			}
		}
		System.out.println(profit);
	}
}
