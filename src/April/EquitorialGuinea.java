package April;
import java.util.*;
public class EquitorialGuinea {
	//1281. Subtract the Product and Sum of Digits of an Integer
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int sum=0;
		int pro=1;
		
		do {
			int temp = num%10;
			
			sum+=temp;
			pro*=temp;
			
			num /=10;
		}while(num!=0);
	
		System.out.println(pro-sum);
	}
}
