package April;

import java.util.*;

public class CentralAfricanRepublic {
	//258. Add Digits
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		if(n>=0 && n<=8) {
			System.out.println(n);
			return;
		}
		
		if(n%9==0) {
			System.out.println(9);
			return;
		}
		
		System.out.println(n%9);
	}
}
