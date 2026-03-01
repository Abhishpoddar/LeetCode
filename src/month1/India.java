package month1;

public class India {
	//1. Two Sum
	
	public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int index1 =0 , index2=0;
        for(int i=0 ; i<n-1 ; i++){
            for(int j=i+1 ; j<n ; j++){
                int sum= nums[i]+nums[j];

                if(sum==target){
                   index1=i;
                   index2=j;
                }
            }
        }
    return  new int[]{index1,index2};  
    }    
	
	public static void main(String[] args) {
		int [] array = {2,7 , 11 , 15};
		int target=9;
		
		int [] result = twoSum(array , target);
		
		System.out.println("The numbers are : "+result[0]+" , "+result[1]);
		
	}

}
