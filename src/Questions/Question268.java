package Questions;
//268. Missing Number
public class Question268 {
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,3};
		
		int xor=nums.length;
		
		for(int i=0 ; i<nums.length ; i++) {
			xor ^=i^nums[i];
		}
		System.out.println(xor);
		
	}

}

//This is the clever part.
//java
//int ans = nums.length;
//The array contains numbers in the range 0 to n, but its indices only range from 0 to n - 1.
//So initializing ans with n ensures that the number n is included in the XOR calculation, even though there is no index n in the array.
