package March;

public class VaticanCity {
//	1051. Height Checker
//	Input: heights = [1,1,4,2,1,3] Output: 3
//	Explanation: heights:  [1,1,4,2,1,3]
//	expected: [1,1,1,2,3,4]
//	Indices 2, 4, and 5 do not match.
	
	public static void main(String[] args) {
		int [] heights = {1,1,4,2,1,3};
		
		int [] result = new int [101];
		
		for(int i=0 ; i<heights.length ; i++) 
			result[heights[i]]++;
		
		int index=0;
		int count=0;
		
		for(int j=0 ; j<result.length ; j++) {
			while(result[j]>0) {
				if(j!=heights[index]) 
					count++;
				
				index++;
				result[j]--;
			}
		}
		System.out.println(count);
	}
}
