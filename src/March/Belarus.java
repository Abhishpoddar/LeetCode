package March;
//Brute Force
public class Belarus {
//	Richest Customer Wealth
//	Use prefix sum row-wise to compute sums efficiently across accounts.
//	Input: accounts = [[1,5],[7,3],[3,5]]
//	Output: 10
//	Explanation: 
//	1st customer has wealth = 6
//	2nd customer has wealth = 10 
//	3rd customer has wealth = 8
//	The 2nd customer is the richest with a wealth of 10.
	public static void main(String[] args) {
		int [] [] accounts = {{1,5},{7,3},{3,5}};
		
		int maxWealth=0;
		
		for(int i=0 ; i<accounts.length ; i++) {
			int prefix=accounts[i][0];
			for(int j=1 ; j<accounts[i].length ; j++) {
				prefix +=accounts[i][j];
			}
			maxWealth= Math.max(maxWealth, prefix);
		}
		
		System.out.println(maxWealth);
	}

}
