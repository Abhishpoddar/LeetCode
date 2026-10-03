package Questions;

import java.util.Arrays;

public class Question344 {
	
	public static void main(String[] args) {
		char [] str = {'H','e','l','l','o'};
		
		int start=0;
        int end=str.length-1;
        
        while(start<=end){
            char ch = str[start];
            str[start++]=str[end];
            str[end--]=ch;
        }  
        
        System.out.println(Arrays.toString(str));
	}


}
