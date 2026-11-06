package Questions;
//Input:
//nums = [1, -1, 5, -2, 3]
//k = 3
//Output: 4
//Max size subarray sum equals k
public class Question325 {
	
	public static void main(String[] args) {
		
		int [] nums = {1,-1,5,-2,3};
		int target=3;
		
		int i=0;
		int j=0;
		
		int sum=0;
		int maxLength=Integer.MIN_VALUE;
		
		
		while(i<nums.length) {
			sum+=nums[i];
			
			while(i>j &&sum>=target) {
				
				if(sum==target) {
					maxLength=Math.max(i-j+1, maxLength);
				}
				sum-=nums[j];
				j++;
			}
			i++;
		}
		
		System.out.println(maxLength==Integer.MIN_VALUE ? 0 : maxLength);
	}

}
