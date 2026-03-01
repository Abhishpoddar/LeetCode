package month1;

public class SriLanka {
	//169. Majority Element
	
	
	    public int majorityElement(int[] nums) {
	        int n = nums.length;
	        
	        int freq=0 , elem=0;

	        for(int i=0 ; i<nums.length ; i++){
	            if(freq==0){
	                elem= nums[i];
	            }

	            if(elem==nums[i]){
	                freq++;
	            }
	            else{
	                freq--;
	            }
	        }

	        int count=0;
	        for(int i=0 ; i<nums.length ; i++){
	            if(elem==nums[i]){
	                count++;
	            }
	        }

	        if(count>n/2){
	            return elem;
	        }
	    return -1;    
	    }
	
	    public static void main(String[] args) {
			int [] array = {1,3,5,8,2,2,2};
			int element = majorityElement(array);
			System.out.println("The Element is : "+element);
		}

}
