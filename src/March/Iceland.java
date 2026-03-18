package March;
public class Iceland {
	//50. Pow(x, n)
	//Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
	public static void main(String[] args) {
		double x=2.10000;
		int n=10;
		
		if(n==0 ) { System.out.println(1.0); return;}
        if(n==1) {System.out.println(x); return;}
		if(x==0 || x==1) {System.out.println(x); return;}
		if(x==-1 && n%2==0) {System.out.println(1.0); return;}
		if(x==-1 && n%2==1) {System.out.println(-1.0); return;}
		
		long binary=n;

		if(n<0) {
			binary= -1*binary;
			x=1/x;
		}
		
		double ans=1;
		
		while(binary>0) {
			if(binary%2==1) {
				ans *=x;
			}
			x *=x;
			binary /=2;
		}
		System.out.println(ans);
	}
}
