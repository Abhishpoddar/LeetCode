package Questions;
//11. Container With Most Water
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
public class Question11 {
	
	public static void main(String[] args) {
		
		int [] nums = {1,8,6,2,5,4,8,3,7};
		
		int left=0;
		int right=nums.length-1;
		
		int maxArea=0;
		
		while(left<right) {
			
			int width=right-left;
			int height= Math.min(nums[right], nums[left]);
			
			int area = width*height;
			
			maxArea= Math.max(maxArea, area);
			
			if(nums[left]<nums[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		
		System.out.println(maxArea);
	}

}
