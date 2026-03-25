package March;
public class Netherlands {
//	1011. Capacity To Ship Packages Within D Days
//	Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
//	Output: 15
	private static boolean isValid(int [] weight , int days , int maxWeight) {
		int day=1;
		int load=0;
		
		for(int i=0 ; i<weight.length ; i++) {
			if(load+weight[i]<=maxWeight) 
				load +=weight[i];
			
			else {
				day++;
				load=weight[i];
			}
		}
	return day>days ? false:true;	
	}
	public static void main(String[] args) {
		int [] weights = {1,2,3,4,5,6,7,8,9,10}; 
		int days = 5;
		
		int max=0;
		int sum=0;
		for(int i=0 ; i<weights.length ; i++) {
			max = Math.max(max,weights[i]);
			sum +=weights[i];
		}
		int start=max;
		int end=sum;
		
		int maxWeight=0;
	
		while(start<=end) {
			
			int mid = start+(end-start)/2;
			
			if(isValid(weights , days , mid)){
				maxWeight=mid;
				end=mid-1;
			}
			else 
				start=mid+1;
		}
		System.out.println(maxWeight);
	}	
}
