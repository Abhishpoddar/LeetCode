package Questions;
import java.util.*;
//443. String Compression
public class Question443 {

	public static int compress(char[] chars) {

		 int index = 0;
		for (int i = 0; i < chars.length;) {
			char ch = chars[i];
			int count = 0;

			while (i < chars.length && chars[i] == ch) {
				count++;
				i++;
			}

			if (count == 1) {
				chars[index++] = ch;
			} else {
				chars[index++] = ch;

				String cou = Integer.toString(count);
				
				for(int j=0 ; j<cou.length() ; j++) {
					chars[index++]=cou.charAt(j);
				}
			}

		}
	return index;	
	}

	public static void main(String[] args) {
		
		char [] ch = {'a','a','b','b','b','c','c'};
		
		System.out.println(compress(ch));

	}

}
