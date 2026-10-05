package Questions;
import java.util.*;
//Input:
//['t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e']
//Output:
//['b','l','u','e',' ','i','s',' ','s','k','y',' ','t','h','e']

public class Question186 {
	
	private static char[] getReverse(char [] str) {
		
		int start=0;
		int end=str.length;
		
		while(start<end) {
			char temp = str[start];
			str[start++]=str[end];
			str[end--]=temp;
		}
	return str;	
	}
	
	private static char [] wordReversal(char [] str) {
		
		char [] result = new char[str.length];

		
		str = getReverse(str);
		
		int start=0;
		int end=0;
		
		for(int i=0 ; i<str.length ; i++) {
			
			while(i<str.length && str[i]!=' ') {
				i++;
				end++;
			}
			
			char [] word = new char[end-start+1];
			int k=0;
			for(int j=end-1 ; i>=start ; i--) {
				word[k++]=str[j];
			}
			
			k=0;
			for(int l=start ; l<end ; l++) {
				result[l]=word[k++];
			}
			
			result[]
			start=end+1;
		}
	}
	public static void main(String[] args) {
		
		char [] str = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
		
		System.out.println(Arrays.toString(wordReversal(str)));	
	}
}
