package April;

public class Macedonia {
	//LCM
	private static int getGcd(int a , int b) {
		
		while(a>0 && b>0) {
			if(a>b) {
				a=a%b;
			}else {
				b=b%a;
			}
		}
		if(a==0) {
			return b;
		}
	return a;	
	}
	
	
	private static int getLcm(int a , int b) {
		return a*b/getGcd(a,b);
	}
	public static void main(String[] args) {
		int a = 28 , b=20;
		
		System.out.println(getLcm(a,b));
	}

}
