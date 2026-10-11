package Questions;
import java.util.*;
//287. Find the Duplicate Number
public class Question287 {
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,3,4};//n+1
		
		int slow=nums[0];
		int fast=nums[0];
		
		do {
			slow=nums[slow];
			fast=nums[nums[fast]];
		}while(slow!=fast);
		
		slow=nums[0];
		
		while(slow!=fast) {
			slow=nums[slow];
			fast=nums[fast];
		}
		
		System.out.println(slow);
		
	}

}
