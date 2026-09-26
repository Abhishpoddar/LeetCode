package Questions;
//238. Product of Array Except Self
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
public class Question238 {
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,4};
		
		int [] ans= new int [nums.length];
		
		ans[0]=1;
		for(int i=1 ; i<nums.length ; i++) {
			ans[i]= ans[i-1]*nums[i-1];
		}
		
		int suffix=1;
		
		for(int i=nums.length-2 ; i>=0 ; i--) {
			suffix *=nums[i+1];
			ans[i] =suffix*ans[i];	
		}
		
		for(int i=0 ; i<nums.length ; i++) {
			System.out.println(ans[i]);
		}
		
	}

}
