package Questions;
//1342. Number of Steps to Reduce a Number to Zero
public class Question1342 {
	public static void main(String[] args) {
		
		int num = 24;
		
		int stepCount=0;
		
		int iteration=0;
		
		while(num!=0) {
			if(num%2==0) {
				num/=2;
				stepCount++;
			}
			
			if(num%2!=0){
				num-=1;
				stepCount++;
			}
			iteration++;
			
		}
		
		System.out.println(stepCount);
		System.out.println(iteration);
	}

}
