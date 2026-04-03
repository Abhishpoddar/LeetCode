package April;
import java.util.*;
public class Croatia{
//	438. Find All Anagrams in a String
//	Input: s = "cbaebabacd", p = "abc"
//	Output: [0,6]
	private static boolean isFreq(int [] a , int [] b) {
		for(int i=0 ; i<26 ; i++) {
			if(a[i]!=b[i]) 
				return false;
		}
	return true;	
	}
	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		
		List<Integer> list = new ArrayList<Integer>();
		
		int [] count = new int [26];
		for(int i=0 ; i<p.length() ; i++) 
			count[s.charAt(i)-'a']++;
		
		for(int i=0 ; i<s.length() ; i++) {
			
			int index=i ,windowIndex=0;
			int [] window = new int[26];
			
			while(index<s.length() && windowIndex<p.length()) {
				window[s.charAt(index)-'a']++;
				windowIndex++;
				index++;
			}
			
			if(isFreq(count , window)) 
				list.add(i);
		}	
		for(int ele : list) {
			System.out.println(ele);
		}	
	}
}