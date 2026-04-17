package March;

public class Estonia{
//	121. Best Time to Buy and Sell Stock
//	Input: prices = [7,1,5,3,6,4]
//	Output: 5
//	Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//	Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
	public static void main(String[] args) {
		int[] nums = { 7, 1, 5, 3, 6, 4 };
	
		int bestBuy=nums[0];
		int maxProfit=0;
		
		for(int i=1; i<nums.length ; i++) {
			if(nums[i]>bestBuy) {
				maxProfit=Math.max(maxProfit, nums[i]-bestBuy);
			}
			bestBuy= Math.min(nums[i], bestBuy)	;	
		}
		System.out.println(maxProfit);
	}
}
