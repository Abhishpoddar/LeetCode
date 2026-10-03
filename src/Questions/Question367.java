package Questions;
import java.util.*;
//367. Valid Perfect Square
public class Question367 {
	
	static Scanner sc = new Scanner(System.in);
	
	private static boolean isPerfectSquare(int num) {

        if(num==0 || num==1) return true;

            int start=0;
            int end=num/2;

            while(start<=end){
                int mid = start+(end-start)/2;

                long prod=(long)mid*mid;

                if(prod==num){
                    return true;
                }
                else if(prod<num){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
    return false;        
    }
	
	public static void main(String[] args) {
		

		
		System.out.println("Enter the number : ");
		
		int num = sc.nextInt();
		
		System.out.println(isPerfectSquare(num));
	}

}
