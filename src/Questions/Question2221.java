package Questions;
//2221. Find Triangular Sum of an Array
public class Question2221 {
	
	public static int triangularSum(int[] nums) {
        if(nums.length==1) {
        	return nums[0];
        }
        
        int [] arr = new int[nums.length-1];
        
        for(int i=0 ; i<arr.length ; i++){
            arr[i]= (nums[i]+nums[i+1])%10;
        }

    return triangularSum(arr);
	}
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5};
		System.out.println(triangularSum(nums));
	}

}
