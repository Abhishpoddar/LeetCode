package April;
public class CoteDeIvoire {
	//628. Maximum Product of Three Numbers
	//Input: nums = [1,2,3]
	//Output: 6
	public static void main(String[] args) {
		int [] nums = {1,2,3};
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int max3=Integer.MIN_VALUE;
		
		int min1=Integer.MAX_VALUE;
		int min2=Integer.MAX_VALUE;
		
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]>max1) {
				max3 = max2;
				max2=max1;
				max1=nums[i];
			}
			else if(nums[i]>max2) {
				max3 = max2;
				max2 = nums[i];
			}
			else 
				max3 = nums[i];
			
			if(nums[i]<min1) {
				min2=min1;
				min1=nums[i];
			}
			else if(nums[i]<min2)
				min2=nums[i];
		}
		System.out.println(Math.min(max1*max2*max3, max1*min1*min2));
	}
}
