package April;

import java.util.*;

public class Guinea {
	static //2413. Smallest Even Multiple
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num);
			return;
		}
		
		System.out.println(num*2);	
		
	}

}
