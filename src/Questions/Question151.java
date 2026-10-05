package Questions;
import java.util.*;
//151. Reverse Words in a String
//Input: s = "the sky is blue"
//Output: "blue is sky the"
public class Question151 {
	
	private static String getReverse(String str) {
		
		String res="";
		
		for(int i=str.length()-1 ; i>=0 ; i--) {
			res += str.charAt(i);
		}
	return res;	
	}
	
	private static String reverseWords(String str) {
        String ans = "";
        
        str = getReverse(str);
        
        for(int i=0 ; i<str.length() ; i++) {
        	
        	String word="";
        	
        	while(i<str.length() && str.charAt(i)!=' ') {
        		word+=str.charAt(i);
        		i++;
        	}
        	
        	if(word.length()>0) {
        		ans +=" "+getReverse(word);
        	}
        }
    return ans.substring(1);    
        
    }
	public static void main(String[] args) {
		
		String str="the sky is blue";
		
		System.out.println(str);
		System.out.println(reverseWords(str));
		
	}

}
