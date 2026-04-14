package April;
public class SaoTomeAndPrincipe {
	//171. Excel Sheet Column Number
	//Input: columnTitle = "ZY"
	//Output: 701
	private static int titleToNumber(String str) {
		
		int num=0;
        for(int i=0 ; i<str.length() ; i++){
             num = num*26+(int)(str.charAt(i)-'A')+1;
        }
     return num;  
    }
	
	public static void main(String[] args) {
		String str = "ZY";
		
		System.out.println(titleToNumber(str));		
	}
}