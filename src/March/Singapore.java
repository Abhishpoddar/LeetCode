package March;
//   75 : Sort Colors (Dutch National Flag)
//   Sort 0s, 1s, and 2s in-place
public class Singapore {
	public static void main(String[] args) {
		int [] nums = {0,2,1,0,2,1};
		
		int i = 0;
		int j = 0;
		int k = nums.length-1;

		while(j<=k) {
			
			if(nums[j]==0) {
				int temp = nums[j];
				nums[j++]=nums[i];
				nums[i++]=temp;
			}
			
			else if(nums[j]==1) 
				j++;
			
			else{
				int temp = nums[j];
				nums[j]=nums[k];
				nums[k--]=temp;
			}
		}
		for(int num : nums) {
			System.out.println(num);
		}
	}
}
