package Questions;

public class Question152 {
	
	public static void main(String[] args) {
		   int [] nums = {2,3,-2,4};
		        int maxPro=Integer.MIN_VALUE;
		        int currentPro=1;

		        for(int i=0 ; i<nums.length ; i++){
		            currentPro*=nums[i];
		            maxPro=Math.max(currentPro,maxPro);
		            if(currentPro==0){
		                currentPro=1;
		            }
		        }

		        currentPro=1;
		        for(int i=nums.length-1 ; i>=0 ; i--){
		            currentPro*=nums[i];
		            maxPro=Math.max(currentPro,maxPro);
		            if(currentPro==0){
		                currentPro=1;
		            }
		        }
		    System.out.println(maxPro);    
		    }
		
	

}
