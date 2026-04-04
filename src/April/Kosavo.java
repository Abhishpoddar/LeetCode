package April;

public class Kosavo {
	//Armstrong number
	
	public static void main(String[] args) {
		int num = 370;
		
		int copy = num;
		int sum=0;
		
		
		do {
			int temp = num%10;
			sum += temp*temp*temp;
			num /=10;
		}while(num!=0);
		
		System.out.println(copy==sum);
	}
	
	

}
