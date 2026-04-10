package April;
public class CapeVerde {
	//2778. Sum of Squares of Special Elements 
	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		int n=nums.length;
		
		int sum=0;
		
		for(int i=1 ; i<nums.length+1 ; i++) {
			if(n%i==0) {
				sum +=nums[i-1]*nums[i-1];
			}
		}
		
		System.out.println(sum);	
	}
}
