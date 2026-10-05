package Questions;
import java.util.*;
//49. Group Anagrams
public class Question49 {
	
	private static boolean isAnagram(String str1 , String str2) {
		
		if(str1==null || str2==null) return false;
		
		if(str1.length()!=str2.length()) return false;
		
		int [] freq= new int [26];
		
		for(int i=0 ; i<str1.length() ; i++) {
			freq[str1.charAt(i)-'a']++;
			freq[str2.charAt(i)-'a']--;
		}
		
		for(int i=0 ; i<freq.length ; i++) {
			if(freq[i]!=0) {
				return false;
			}
		}
	return true;
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {

        boolean [] flag = new boolean[strs.length];

        List<List<String>> list = new ArrayList<>();
        

        for(int i=0 ; i<strs.length ; i++){
             List<String> innerList =  new ArrayList<>();
             
             if(!flag[i]) {
            	 innerList.add(strs[i]);
            	 flag[i]=true;

                 int j=i+1;
                 while(j<strs.length){
                    if(!flag[j]  && isAnagram(strs[i],strs[j])){   
                        innerList.add(strs[j]);
                        flag[j]=true;
                    }
                    j++;
                }
                 list.add(innerList);  
             }   
             
        }
    return list;   
    }
	
	public static void main(String[] args) {
		String [] str = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagrams(str));
	}
}
