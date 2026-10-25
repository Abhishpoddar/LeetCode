package Questions;
import java.util.*;
//448. Find All Numbers Disappeared in an Array
public class Question448 {
	
	public static void main(String[] args) {
		
		int [] nums = {4,3,2,7,8,2,3,1};
		
		for(int i=0 ; i<nums.length ; i++) {
			int index= Math.abs(nums[i])-1;
			nums[index]= -Math.abs(nums[index]);
		}
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=0 ; i<nums.length ; i++) {
			if(nums[i]>0) {
				list.add(i+1);
			}
		}
		
		System.out.println(list);
		
		
	}

}
