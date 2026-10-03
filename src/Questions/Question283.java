package Questions;
//Move Zeroes
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
public class Question283 {
	
	public static void main(String[] args) {
		
		int [] nums = {0,1,0,3,12};
		
		int i=0;
		int j=0;
		
		while(j<nums.length) {
			
			if(nums[j]!=0) {
				int temp=nums[j];
				nums[j]=nums[i];
				nums[i++]=temp;
			}
		j++;	
		}
		
		for(int el : nums) {
			System.out.println(el);
		}
	}

}
