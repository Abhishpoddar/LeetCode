package Questions;
import java.util.*;
//2351. First Letter to Appear Twice
public class Question2351 {

	public static void main(String[] args) {
		String str = "abccbaaaa";
		
		Set<Character>set = new HashSet<>();
		
		for(int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i);
			
			if(set.contains(ch)) {
				System.out.println(ch);
				return;
			}
			set.add(ch);	
		}
	}
}
