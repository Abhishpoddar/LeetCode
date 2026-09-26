package Questions;
import java.util.*;
//771. Jewels and Stones
public class Question771 {
	
	public static void main(String[] args) {
		
		String stones = "aAAbbbb";
		String jewels="aA";//Unique all
		
		Set<Character> jewel = new HashSet<>();
		
		for(int i=0 ; i<jewels.length(); i++) {
			char ch = jewels.charAt(i);
			
			jewel.add(ch);
		}
		
		int count=0;
		for(int i=0 ; i<stones.length() ; i++) {
			char ch = stones.charAt(i);
			
			if(jewel.contains(ch)){
				count++;
			}
		}
		
	System.out.println(count);	
	}

}
