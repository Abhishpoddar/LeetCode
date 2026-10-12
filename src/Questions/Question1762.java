package Questions;
import java.util.*;
//LeetCode 1762 — Buildings With an Ocean View
public class Question1762 {
	
	public static void main(String[] args) {
		
		int [] nums = {18,18,4,14,7,9,2};
		
		 ArrayList<Integer> list = new ArrayList<>();
	        
	        int leader=nums[nums.length-1];
	        list.add(leader);
	        
	        for(int i=nums.length-2 ; i>=0 ;i--){
	            if(nums[i]>=leader){
	                leader=nums[i];
	                list.add(leader);
	            }
	        }
	        
	        Collections.reverse(list);
	        System.out.println(list);
	}
}
