package April;
public class Liberia {
	//2520. Count the Digits That Divide a Number
	public static void main(String[] args) {
		int n =1248;
		
		int count =0;
		int original=n;
		
		do {
			int i = n%10;
			
			if(original%i==0)
				count++;
			
			n /=10;
		}while(n!=0);
		
		System.out.println(count);
	}
}
