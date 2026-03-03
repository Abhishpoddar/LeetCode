package month1;

public class Nepal {
		//Second largest element
		
		public static void main(String[] args) {
			int [] nums = {3,1,5,7};
			
			if(nums.length<2) {
				System.out.println("Atleast two elements should be there ");
				return;
			}
			
			int max1=Integer.MIN_VALUE;
			int max2=Integer.MIN_VALUE;
			
			for(int i=0; i<nums.length ; i++) {
				if(nums[i]>max1) {
					max2 =max1;
					max1=nums[i];
				}
				else if(nums[i]>max2  && max1!=nums[i]){
				max2=nums[i];
				}
			}
			
			if(max2==Integer.MIN_VALUE) {
				System.out.println("No second max found");
				return;
			}
			
			System.out.println("First Max : "+max1);
			System.out.println("Second Max : "+max2);
		}
}
