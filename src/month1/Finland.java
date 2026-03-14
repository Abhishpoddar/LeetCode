package month1;

public class Finland {
	//Move zeroes at the end of the array with maintaning order
	public static void main(String[] args) {
		int [] nums = {1,0,1};
		
		int start=0;
		int end=0;
		
		while(end<nums.length) {
			if(nums[end]!=0) {
				int temp=nums[end];
				nums[end]=nums[start];
				nums[start++]=temp;	
			}
		end++;	
		}
		
		for(int num : nums) {
			System.out.println(num);
		}
	}

}
