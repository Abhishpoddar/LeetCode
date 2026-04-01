package March;
import java.util.*;
public class Malta {
	//Reverse String
	//Reverse a character array in-place using two pointers.
	public static void main(String[] args) {
		
		char [] ch = {'a','e','i','o','u'};
		
		int i=0 ;
		int j=ch.length-1;
			
		while(i<=j) {
			char c =ch[i];
			ch[i++]=ch[j];
			ch[j--]=c;	
		}
		
		System.out.println(Arrays.toString(ch));
	}
}
