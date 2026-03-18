package March;

public class Phillipines {
	//Efficient anagram time complexity O(n)
	
		public static void main(String[] args) {
			String str = "The quick brown fox jumps over the lazy dog";
			
			str = str.toLowerCase();
			boolean [] result = new boolean[26];
			int count=0;
			
			for(int i=0 ; i<str.length() ; i++) {
				
				char ch = str.charAt(i);
				
				if(ch>='a' && ch<='z') {
					
					int newIndex= ch-'a';
					
					if(!result[newIndex]) {
						result[newIndex]=true;
						count++;
					}
				}
				
				
			}
			if(count==26) {
				System.out.println("Panagram");
			}
			else {
				System.out.println("Not");
			}
		}

}
