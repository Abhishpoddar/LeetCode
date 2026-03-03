package month1;

public class Pakistan {
		//Problem: Two Sum II (Sorted Array)
		//numbers = [2,7,11,15]
		//target = 9
		
		public static void main(String[] args) {
			int [] nums = {2,7,11,15};
			int target=9;
			
			int i=0 , j=nums.length-1;
			
			while(i<j) {
				int sum =nums[i]+nums[j];
				
				if(sum<target) {
					i++;
				}
				else if(sum>target) {
					j--;
				}
				else if(sum==target) {
					break;
				}
			}
			System.out.println("["+(i+1)+", "+(j+1)+"]");
		}

	


}
