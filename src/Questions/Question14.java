package Questions;

public class Question14 {
	
	private static String longestCommonPrefix(String[] strs) {

        if(strs.length==1) return strs[0]; 

        int i = 1;
		int j = 0;

		int common = Integer.MAX_VALUE;

		while (i < strs.length) {
			int length = Math.min(strs[i].length(),strs[j].length());
			
			int count=0;
			for(int k=0 ; k<length ; k++) {
				if(strs[i].charAt(k)==strs[j].charAt(k)) {
					count++;
				}
                else{
                    break;
                }
			}
			common = Math.min(common, count);
			
			i++;
			j++;
		}
		
		String str = "";
		
		for(int l=0 ; l<common ; l++) {
			str += strs[0].charAt(l);
		}
    return str;    
        
    }
	public static void main(String[] args) {
		
		String [] strs = {"flower","flow","flight"};
			
		System.out.println(longestCommonPrefix(strs));
	}
}
