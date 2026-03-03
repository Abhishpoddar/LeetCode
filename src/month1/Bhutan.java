package month1;

public class Bhutan {
	//Move Zeroes
	//Move all zeros to the end while maintaining order2E
	
	public static void main(String[] args) {
		
		int [] nums = {0,2,0,3,5};
		
		int i=0;
		
		for(int j=0 ; j<nums.length ; j++) {
			if(nums[j]!=0) {
				int temp = nums[j];
				nums[j]=nums[i];
				nums[i++]=temp;
			}
		}
		
		for(int num : nums) {
			System.out.println(num);
		}
	}

	

}
