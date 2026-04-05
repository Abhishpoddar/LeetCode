package April;

public class Romania {
	//2217. Find Palindrome With Fixed Length
	private  static int getReverse(int num) {//
		int revNumber=0;
		
		while(num!=0) {
			int temp = num%10;
			if(revNumber>Integer.MAX_VALUE/10 || revNumber<Integer.MIN_VALUE/10) 
				return 0;
			
			revNumber = revNumber*10+temp;
			num/=10;
		}
	return revNumber;		
	}
	
    public static  boolean isPallindrome(int num) {
        if(num<0) return false;
        if(num>=0 && num<=9) return true;

        int rev = getReverse(num);

    return rev==num;    
    }

    private static  int []  getPallindrome(int max , int intLength){
        int [] pallindromes = new int[max+1];
        
        int start=(int)Math.pow(10, intLength-1);
        int end=(int)Math.pow(10, intLength)-1;
        
        int i=1;
        int j=start;
        while(i<pallindromes.length  && j<=end){
            if(isPallindrome(j)){
                pallindromes[i]=j;
                i++;
            }
            j++;
        }
    return pallindromes;    
    }

    public  static long [] kthPalindrome(int[] queries, int intLength) {
    	
    	int max=0;
    	for(int elem : queries) {
    		if(elem>max) 
    			max=elem;
    	}

        int [] pallindromes = getPallindrome(max ,intLength);
        long [] result  = new long [queries.length];
        for(int i=0; i<queries.length ; i++){
            result[i]=pallindromes[queries[i]];
        }
    return result;       
    }
    
    public static void main(String[] args) {
    	int []  queries = {1,2,3,4,5,90};
    	int intLength = 3;
    	
    	long [] result  = new long [queries.length];
    	result = kthPalindrome(queries, intLength);
    	
    	for(long elem : result) {
    		System.out.println(elem);
    	}	
	}
}
