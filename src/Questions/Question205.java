package Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Isomprphic Strings
public class Question205 {
static Scanner sc = new Scanner(System.in);
	
	
	private static boolean isIsomorphic(String str1 , String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		Map<Character , Character> map1 = new HashMap<>();
		Map<Character , Character> map2 = new HashMap<>();
		
		for(int i=0 ; i<str1.length() ; i++) {
			
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			
			if(map1.containsKey(ch1)) {
				if(map1.get(ch1)!=ch2) {
					return false;
				}
			}
			
			if(map2.containsKey(ch2)) {
				if(map2.get(ch2)!=ch1) {
					return false;
				}
			}
			
			map1.put(ch1, ch2);
			map2.put(ch2, ch1);
		}
	return true;	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter the String : ");
		String str1 = sc.next().toLowerCase();
		
		System.out.println("Enter the other String : ");
		String str2 = sc.next().toLowerCase();
		
		System.out.println(isIsomorphic(str1 , str2));
		
	
	}
}
