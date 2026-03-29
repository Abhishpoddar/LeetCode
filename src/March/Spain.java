package March;
class Spain {
	//Bubble sort
	private static void bubbleSort(int [] nums) {
		for(int i=0 ; i<nums.length-1 ; i++) {
			boolean isSwap=false;
			for(int j=0 ; j<nums.length-i-1; j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					isSwap=true;
				}
			}
			if(!isSwap) {
				break;
			}
		}
		for(int ele : nums) {
			System.out.println(ele);
		}
	}
	
	
	public static void main(String[] args) {
		int  [] nums = {5,1,3,4,2};
		bubbleSort(nums);
	}
}