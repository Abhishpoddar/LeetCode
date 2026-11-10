package Questions;
import java.util.*;
//131. Palindrome Partitioning
public class Question131 {
	
	private static boolean isPallindrome(String str) {
		
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
	return true;	
	}

	private static List<List<String>> getPartitions(String str, List<String> current , List<List<String>> list) {

		if (str.isEmpty()) {
			
			list.add(new ArrayList<>(current));
		return list;	
		}
		

		for (int i = 0; i < str.length(); i++) {

			String part = str.substring(0, i + 1);

			if (isPallindrome(part)) {
				current.add(part);
				getPartitions(str.substring(i + 1), current , list);
				
				current.removeLast();
			}
	
		}
		
		return list;
	}

	public static List<List<String>> partition(String str) {

		List<String> current = new ArrayList<>();
		List<List<String>> list = new ArrayList<>();

		return getPartitions(str, current , list);

	}

	public static void main(String[] args) {
		
		System.out.println(partition("aabbcc"));

	}

}
