package month1;

public class Bangladesh {
	//Remove Element
	//Remove all occurrences of a value in-place.
	
	public static void main(String[] args) {
		int [] nums = {1,2,2,4,6,7};
		int val=2;
		int i=0;
		
		for(int j=0 ; j<nums.length ; j++) {
			if(nums[j]!=val) {
				nums[i++]=nums[j];
			}
		}
		System.out.println(i);
		
	}


}
