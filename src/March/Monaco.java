package March;

public class Monaco {
	//Selection Sort
	public static void main(String[] args) {
		int [] nums = {1,5,3,4,2};
		
		for(int i=0 ; i<nums.length-1 ; i++) {
			int index=i;
			for(int j=i+1 ; j<nums.length ; j++) {
				if(nums[index]>nums[j]) {
					index=j;
				}
			}
			
			int temp=nums[index];
			nums[index]=nums[i];
			nums[i]=temp;
		}
		
		for(int ele : nums) {
			System.out.println(ele);
		}
	}

}
