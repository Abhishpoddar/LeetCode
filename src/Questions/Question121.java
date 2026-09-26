package Questions;
//121. Best Time to Buy and Sell Stock
//Input: prices = [7,1,5,3,6,4]
//Output: 5
public class Question121 {
	
	public static void main(String[] args) {
		
		int [] prices= {7,1,5,3,6,4};
		
		int bestBuy=prices[0];
		int maxProfit=0;
		
		for(int i=1 ; i<prices.length ; i++){
			
			if(prices[i]>bestBuy) {
				maxProfit = Math.max(maxProfit, prices[i]-bestBuy);
			} 
			
			bestBuy = Math.min(prices[i], bestBuy);
		}
		
		System.out.println(maxProfit);
	}

}
