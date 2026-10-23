package Questions;
//724. Find Pivot Index
public class Question724 {
	
	public static void main(String[] args) {
		
		int [] nums = {-1,-1,0,1,1,0};
		
		int sum=0;
		for(int i=0 ; i<nums.length ; i++) {
			sum+=nums[i];
		}
		
		int leftSum=0;
		int rightSum=sum;
		
		for(int i=0 ; i<nums.length ; i++) {
			
			rightSum-=nums[i];
			
			if(leftSum==rightSum) {
				System.out.println(i);
				return;
			}
			
			leftSum+=nums[i];
			
		}
		System.out.println(-1);
	}

}
