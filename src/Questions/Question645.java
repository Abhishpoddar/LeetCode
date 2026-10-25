package Questions;
//645. Set Mismatch
import java.util.*;
public class Question645 {
	
	public  static int[] findErrorNums(int[] nums) {

        int [] result = new int[2];

        int n=nums.length;

        int expectedSum=n*(n+1)/2;

        int actualSum=0;

        Set<Integer> set = new HashSet<>();

        for(int i=0 ; i<nums.length ; i++){

            if(set.contains(nums[i])){
                result[0]=nums[i];
            }
            set.add(nums[i]);

            actualSum+=nums[i];
        }

        result[1]=expectedSum-actualSum+result[0];

    return result;
    }
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,2,4};
		
		System.out.println(Arrays.toString(findErrorNums(nums)));
		
		
	}

}
