package Questions;
//28. Find the Index of the First Occurrence in a String

public class Question28 {
	
	public static int strStr(String haystack, String needle) {

        for(int i=0 ; i<haystack.length()-needle.length()+1 ; i++){
            
            int idx=i;
            int j=0;
            while(j<needle.length()){
                if(haystack.charAt(idx)!=needle.charAt(j)){
                    break;
                }
                idx++;
                j++;
            }

            if(j==needle.length()){
                return i;
            }
        }
    return -1;
	}
	
	public static void main(String[] args) {
		
		String str = "sadbutsad";
		String res ="sad";
		
		System.out.println(strStr(str, res));
	}

}
