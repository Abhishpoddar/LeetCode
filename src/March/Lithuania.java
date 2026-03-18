package March;
//Brute Force
public class Lithuania {
//	11. Container With Most Water
//	Input: height = [1,8,6,2,5,4,8,3,7]
//	Output: 49
	
	public static void main(String[] args) {
		int [] height = {1,8,6,2,5,4,8,3,7};
	sdfsfdsfds	
		int maxWater = Integer.MIN_VALUE;
		
		for(int i=0 ; i<height.length-1 ; i++) {
			for(int j=i+1 ; j<height.length ; j++) {
				int width = (j-i);
				int high = Math.min(height[i],height[j]);
				
				maxWater = Math.max(maxWater, high*width);
			}
		}
	System.out.println(maxWater);	
	}

}
