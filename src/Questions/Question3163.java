package Questions;
//3163. String Compression III
//Input: word = "aaaaaaaaaaaaaabb"
//Output: "9a5a2b"
public class Question3163 {
	
	public static String compressedString(String word) {

        char[] words = word.toCharArray();
        char[] result = new char[words.length];
        
        int index=0;
    	int count=1;
        
        for(int i=0 ; i<word.length() ; i++) {

        	
        	if(i+1<words.length &&  count<9 && words[i]==words[i+1] ) {
        		count++;
        	}
        	else {
        		result[index++]=(char)(count+'0');
        		result[index++]=words[i];
        		count=1;
        	}
        }
     return new String(result,0,index);   
    }
	
	
	public static void main(String[] args) {
		
		String word = "aaaaaaaaaaaaaabb";
		System.out.println(compressedString(word));

	}

}
