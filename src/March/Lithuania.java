package March;
//Two pointer
public class Lithuania {
//	11. Container With Most Water
//	Input: height = [1,8,6,2,5,4,8,3,7]
//	Output: 49
	public static void main(String[] args) {
		int [] height = {1,8,6,2,5,4,8,3,7};
		
		int leftPart=0;
		int rightPart=height.length-1;
		
		int maxWater = Integer.MIN_VALUE;
		
		while(leftPart<rightPart) {
			int width= rightPart-leftPart;
			int length= Math.min(height[rightPart],height[leftPart]);
			int currentWater = width*length;
			
			maxWater = Math.max(maxWater, currentWater);
			
			if(height[leftPart]<height[rightPart]) 
				leftPart++;
		
			else 
				rightPart--;
		}
		System.out.println(maxWater);	
	}
}