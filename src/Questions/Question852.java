package Questions;
//852. Peak Index in a Mountain Array
public class Question852 {
	
	private static int peakIndexInMountainArray(int[] nums) {

        if(nums.length==0) return -1;
        if(nums.length==1) return 0;
        if(nums.length==2) return nums[0]>nums[1]? 0 : 1;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;


        int start=1;
        int end=nums.length-2;

        while(start<=end){

            int mid = start+(end-start)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }

            else if(nums[mid]<nums[mid+1]){
                start=mid+1;   
            }
            else {
                end=mid-1;
            }
        }
    return -1;    
    }
	
	public static void main(String[] args) {
		int [] nums = {3,5,3,2,0};
		
		System.out.println(peakIndexInMountainArray(nums));
	}

}
