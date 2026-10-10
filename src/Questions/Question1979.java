package Questions;
//1979. Find Greatest Common Divisor of Array
public class Question1979 {
	
	private static int getGcd(int a , int b) {
		
		if(a==0) return b;
		if(b==0) return a;
		if(a==b) return a;
		
		while(a>0 && b>0) {
			if(a>b) {
				a%=b;
			}else {
				b%=a;
			}
		}
	return 	a==0 ? b :a;
	}
	
	public static void main(String[] args) {
		
		int [] nums = {2,5,6,9,10};
		
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		
		for(int i =0 ; i<nums.length ;i++) {
			if(nums[i]<smallest) {
				smallest=nums[i];
			}
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
		
		System.out.println(getGcd(largest,smallest));
	}

}
