package April;
public class Mauritania {
	// 1295. Find Numbers with Even Number of Digits
	private static int getDigit(int num){
		int count=0;
		
		do {
			num /=10;
			count++;
		}while(num!=0);	
	return count;	
	}
	
	private static int findNumbers(int[] nums) {
		
		if(nums.length==0) 
			return 0;
		
		int count=0;
		for(int i=0 ; i<nums.length ; i++) {
			if(getDigit(nums[i])%2==0) {
				count++;
			}
		}
	return count;
	}

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896 };
		
		System.out.println(findNumbers(nums));
	}
}
