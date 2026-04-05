package April;
public class Greece {
	//7. Reverse Integer
	//Example 1: Input: x = 123
	//Output: 321
	private static int getReverse(int num){
		if(num>=0 && num<=9) {
			return num;
		}
		int revNumber=0;
		
		while(num!=0) {
			int temp = num%10;
			
			if(revNumber>Integer.MAX_VALUE/10 || revNumber<Integer.MIN_VALUE/10) 
				return 0;
			
			revNumber = revNumber*10+temp;
			num/=10;
		}
	return revNumber;		
	}
	public static void main(String[] args) {
		int num = 4567;
		System.out.println(getReverse(num));
	}
}
