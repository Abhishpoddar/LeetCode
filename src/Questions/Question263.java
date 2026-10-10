package Questions;
import java.util.*;
//263. Ugly Number
public class Question263 {
    public static boolean isUgly(int num) {
    	
    	if(num<=0) return false;
    	
    	int [] factors = {2,3,5};
    	
    	for(int i=0 ; i<factors.length ; i++) {
    		
    		while(num%factors[i]==0) {
    			num/=factors[i];
    		}
    	}
    	System.out.println(num);
    return num==1;	
    }
    
    public static void main(String[] args) {
		int num = 450;
		
		System.out.println(isUgly(num));
	}

}
