package March;
public class Andorra{
//	31. Next Permutation
//	Example 1:Input: nums = [1,2,3]
//	Output: [1,3,2]
	private static void getReverse(int [] nums , int start , int end) {
		
		while(start<end) {
			int temp=nums[start];
			nums[start++]=nums[end];
			nums[end--]=temp;
		}	
	}
	
	private static void getPrint(int [] nums) {
		for(int ele : nums) 
			System.out.println(ele);
	}
	
	public static void main(String[] args) {
		int [] nums = {3,2,1};
		
		//Step 1 : Find the pivot
		int pivot=-1;
		
		for(int i=nums.length-2 ; i>=0 ; i--) {
			if(nums[i]<nums[i+1]) {
				pivot=i;
				break;
			}
		}
		
		if(pivot==-1) {
			getReverse(nums , 0 , nums.length-1);
			getPrint(nums);
			return;
		}
		
		//Step 2 :- Next greatest element & swapping
		for(int j=nums.length-1 ; j>=0 ; j--) {
			if(nums[pivot]<nums[j]) {
				int temp= nums[pivot];
				nums[pivot]=nums[j];
				nums[j]=temp;
				break;
			}
		}
		
		//Step 3 :- reverse(pivot+1 , nums.length-1)
		getReverse(nums , pivot+1 , nums.length-1);
		getPrint(nums);
	}
}
