package Questions;

public class Question50 {
	
	private static double myPow(double x, int n) {

        if(n==0) return 1.0;
        if(n==1) return x;
        if(x==1) return 1.0;
        if(x==-1 && n%2==0) return 1.0;
        if(x==-1 && n%2==1) return -1.0;

        double ans=1;
        long binary=n;

        if(binary<0){
            binary=-binary;
            x=1/x;
        }

        while(binary>0){
            
            long temp = binary%2;
            if(temp==1){
                ans *=x;
            }
                
            x*=x;
            binary/=2;
        }
    return ans;    
    }
	
	
	public static void main(String[] args) {
		
		double num = 2;
		int pow=8;
		
		System.out.println(myPow(num, pow));
	}
}
