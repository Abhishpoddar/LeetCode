package month1;

public class Georgia {
//	238. Product of Array Except Self
//	🔗 Problem: Product of Array Except Self
//	Concept
//	Prefix + suffix product.
//	Idea
//	left[i]  = product of elements before i
//	right[i] = product of elements after i
//	answer[i] = left[i] * right[i]
//	Optimized solution uses O(1) extra space.
	
	private static int [] getResult(int [] nums) {
		
		int [] left= new int[nums.length];
		int [] right= new int[nums.length];
		
		left[0]=nums[0];
		
		for(int i=1 ; i<nums.length ; i++) {//for left side
			left[i]= left[i-1]*nums[i];
		}
		
		right[nums.length-1]=nums[right.length-1];//for right side
		
		for(int j=nums.length-2 ; j>=0 ; j--) {
			right[j]= right[j+1]*nums[j];
		}
		
		int [] prefix = new int[nums.length];
		
		prefix[i]=
		
		for(int i=0 ; i<nums.length-1 ; i++) {
			prefix[i]=left[i-1]*right[nums.length-1-i];
		}
	return prefix;	
		
	}
	
	public static void main(String[] args) {
		int [] nums = {1,2,3,4,0};
		
		
		 nums =getResult(nums);
		 
		 for(int num : nums) {
			 System.out.println(num);
		 }
	}
}
