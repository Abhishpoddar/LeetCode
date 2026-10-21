package Questions;
import java.util.*;
public class Question92 {
	
	private static String getSwap(String str , int i , int j) {
		
		char [] ch = str.toCharArray();
		
		char temp = ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		
	return new String(ch);
	}
	
	private static List<List<String>> permute(String str ,int idx , List<List<String>> list , List<String> current){
		
		if(idx==str.length()) {
			
			List<String> per = new ArrayList<>();
			
			per.add(str);
			list.add(new ArrayList<>(per));
			return list;
		} 
		
		for(int i=idx ; i<str.length() ; i++) {
			
			String swapped = getSwap(str , i , idx);
			
			permute(swapped, idx+1, list, current);

			
		}
	return list;	
	}
	
	public static void main(String[] args) {
		String str = "abc";
		
		List<List<String>> list = new ArrayList<>();
		
		List<String> current = new ArrayList<>();
		
		System.out.println(permute(str , 0, list , current));
	}

}
