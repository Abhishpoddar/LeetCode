package Questions;
import java.util.Arrays;
//345. Reverse Vowels of a String
public class Question345 {
	
	private static void getSwap(char [] ch , int i , int j) {
		
		char temp = ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
	
	public static void main(String[] args) {
		
		String str ="Icecream";
		
		char [] ch = new char[str.length()];

        for(int i=0 ; i<str.length() ; i++){
            char cha = str.charAt(i);
            ch[i]=cha;
        }

        int start=0;
        int end=ch.length-1;

        while(start<=end){

            if(!"aeiouAEIOU".contains(String.valueOf(ch[start]))) {
            	start++;
            }
            else if(!"aeiouAEIOU".contains(String.valueOf(ch[end]))) {
            	end--;
            }
            else {
            	getSwap(ch , start , end);
            	start++;
            	end--;
            }
        }
        
        System.out.println(new String(ch));  
	}
}
