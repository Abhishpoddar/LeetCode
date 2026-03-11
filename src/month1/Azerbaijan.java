package month1;

public class Azerbaijan {
	//152. Minimum Product Subarray
	
		public static void main(String[] args) {
			int [] nums = {3,-1,4};
			
			int minPro= Integer.MAX_VALUE;
			int pro=1;
			
			for(int i=0 ; i<nums.length ; i++) {
				pro *=nums[i];
				minPro= Math.min(minPro, pro);
				
				if(pro==0) {
					pro=1;
				}
			}
			
			pro=1;
			
			for(int i=nums.length-1 ; i>=0 ; i--) {
				pro *=nums[i];
				minPro= Math.min(minPro, pro);
				
				if(pro==0) {
					pro=1;
				}
			}
			
			System.out.println(minPro);
		}

}
