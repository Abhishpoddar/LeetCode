package month1;

public class Taiwan {
//	713. Subarray Product Less Than K
//	Input: nums = [10,5,2,6], k = 100
//	Output: 8
	
	    public static int numSubarrayProductLessThanK(int[] nums, int k) {

	        if(k<=0){
	            return 0;
	        }
	        int count=0;

	        for(int i=0 ; i<nums.length ; i++){
	            int prod=1;
	            for(int j=i ; j<nums.length ; j++){
	                prod  = prod*nums[j];    
	                 if(prod<k){
	                    count++;
	                }
	                else{
	                    break;
	                }
	            }
	            
	        }
	    return count;    
	    }
	    
	    public static void main(String[] args) {
			int [] nums = {10,5,2,6};
			int k=100;
			int l = numSubarrayProductLessThanK(nums ,k);
			System.out.println(l);
			
		}

}
