package April;
public class Ghana {
	// 202. Happy Number
	private static int squareDigitSum(int num) {
		int sum=0;
		do {
			int temp=num%10;
			sum+=temp*temp;
			num/=10;
		}while(num!=0);
	return sum;	
	}
	private static boolean isHappy(int n) {
		if(n==1 || n==7) 
			return false;
		
		int slow=n;
		int fast=n;
		
		do {
			slow = squareDigitSum(slow);
			fast = squareDigitSum(squareDigitSum(fast));
		}while(slow!=fast);
		
	return slow==1|| slow==7;
	}
	public static void main(String[] args) {
		int num = 9;
		
		System.out.println(isHappy(num));
	}
}
