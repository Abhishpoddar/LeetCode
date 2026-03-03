package month1;

public class Myanmar {
	//Remove Duplicates from Sorted Array
	//Modify array in-place so each element appears once
	//Return the number of unique elements
	
	public static void main(String[] args) {
		int [] nums = {1,2,2,2,4,5,5,6};
		
		int i=0;
		
		for(int j=1 ; j<nums.length ; j++) {
			if(nums[j]!=nums[i]) {
				i++;
				nums[i]=nums[j];
			}
		}
		
		System.out.println(i+1);
	}

}
