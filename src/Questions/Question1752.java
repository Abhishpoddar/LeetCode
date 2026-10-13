package Questions;
//1752. Check if Array Is Sorted and Rotated
public class Question1752 {
	
	public static void main(String[] args) {
		int [] nums = {2,3,4,5,1};
		
		int count=0;
				
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]>nums[(i+1)%nums.length]) {
				count++;
			}
		}
		System.out.println((count ==0 || count==1)? true : false);
	}

}
