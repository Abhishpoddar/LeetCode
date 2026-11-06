package Questions;

//209. Minimum Size Subarray Sum
public class Question209 {

	public static void main(String[] args) {
		
		
		int [] nums = {2,3,1,2,4,3};
		int target = 7;
		
		
		int i=0;
		int j=0;
		
		int sum=0;
		int minLength=Integer.MAX_VALUE;
		
		while(i<nums.length) {
			
			sum+=nums[i];
			
			while(i>j && sum>=target) {
				
				minLength=Math.min(i-j+1, minLength);
				sum-=nums[j++];
			}
			i++;
		}
		
		System.out.println(minLength==Integer.MAX_VALUE? 0 : minLength);
	}

}
