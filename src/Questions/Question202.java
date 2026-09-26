package Questions;
import java.util.*;
//Happy numbers
public class Question202 {
	
	private static int getSquareSum(int num) {
		int ans=0;
		
		do {
			int temp= num%10;
			ans = temp*temp;
			num/=10;
		}while(num!=0);
	return ans;	
	}
	
	public static void main(String[] args) {
		
		int num=23;
		Set<Integer> set = new HashSet<>();
		
		while(num!=1) {
			
			if(set.contains(num)) {
				System.out.println(false);
				return;
			}
			
			set.add(num);
			
			num = getSquareSum(num);
		}
		System.out.println(true);
	}
}