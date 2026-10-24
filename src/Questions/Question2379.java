package Questions;
//2379. Minimum Recolors to Get K Consecutive Black Blocks
public class Question2379 {
	
	public static void main(String[] args) {
		
		String str = "WBBBBBWWBW";
		int k=7;
		
		int count=0;
		
		for(int i=0 ; i<k ; i++) {
			char ch = str.charAt(i);
			
			if(ch=='W') {
				count++;
			}
		}
		
		int minCount=count;
		
		for(int i=1 ; i<str.length()-k+1 ; i++) {
			
			if(str.charAt(i-1)=='W') {
				count--;
			}
			
			if(str.charAt(i+k-1)=='W') {
				count++;
			}
			
			minCount=Math.min(minCount, count);
		}
		
		System.out.println(minCount);
	}

}
