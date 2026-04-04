package April;
public class Serbia {
	//443. String Compression
	//Input: chars = ["a","a","b","b","c","c","c"]
	//Output: 6
	//Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
	public static void main(String[] args) {
		char [] chars = {'a','a','b','b','c','c','c'};
		
		int index=0;
		
		int i=0;
		while(i<chars.length) {
			char ch = chars[i];
			int count=0;
			
			while(i<chars.length && chars[i]==ch) {
				count++;
				i++;
			}
			
			if(count==1) {
				chars[index++]=ch;
			}
			else {
				chars[index++]=ch;
				String cou = String.valueOf(count);
				for(int j=0 ; j<cou.length() ; j++) {
					chars[index++]=cou.charAt(j);
				}
			}
		}
		System.out.println(index);
	}
}