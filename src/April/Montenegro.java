package April;
public class Montenegro {
	//204. Count Primes
	//Sieve of Eratosthenes
	//Example 1:Input: n = 10 Output: 4 
	//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
	public static void main(String[] args) {
		int num = 20;
		
		boolean [] isPrime = new boolean[num+1];
		
		int count=0;
		for(int i=2 ; i<num ; i++) {
			if(!isPrime[i]) {
				count++;
				
				for(int j=i*2 ; j<num ; j=j+i) 
					isPrime[j]=true;
			}
		}
		System.out.println(count);
	}
}
