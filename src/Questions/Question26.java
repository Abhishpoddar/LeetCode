package Questions;
//26. Remove Duplicates from Sorted Array
public class Question26 {
	
	public static void main(String[] args) {
		int [] nums = {0,0,1,1,1,2,2,3,3,4};
		
		int k=1;
		
		for(int i=1 ; i<nums.length ; i++) {
			if(nums[i-1]!=nums[i]) {
				nums[k++]=nums[i];
			}
		}
		
		System.out.println(k);
	}

}
