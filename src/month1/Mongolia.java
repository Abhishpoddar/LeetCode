package month1;

public class Mongolia {
//	4. Square Root Using Binary Search
//	Write a program that finds the integer square root of a number N using binary search.
//	Example:
//	Input: N = 25
//	Output: 5
	
	private static int getSquareRoot(int N, int start , int end ){
		
		if (start > end) {
            return end; // end is the integer square root
        }
		
		int mid=start+(end-start)/2;
		int result=mid*mid;
		
		if(N==result) {
			return mid;
		}
		else if(N>result) {
			return getSquareRoot(N,mid+1,end);
		}
		else if(N<result) {
			return getSquareRoot(N,start,mid-1);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int N=27;
		int start=0;
		int end=N;
		
		int result = getSquareRoot(N,start,end);
		System.out.println(result+" is the integer square root of "+N);
		
		
	}

}
