package Questions;
//Reverse of a number
public class Question7 {
	
	public static void main(String[] args) {
		int num =1534236469;

        int rev=0;

        do{
            int temp = num%10;

           if(rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10) {
        	   System.out.println(0);
				return;
			}
            rev = rev*10+temp;
            num/=10;
        }while(num!=0);	
        
        System.out.println(rev);
	}
	
	

}
