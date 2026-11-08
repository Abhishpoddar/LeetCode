package Questions;
import java.util.*;
//47. Permutations II
public class Question47 {
	
	private static void getSwap(int [] nums , int i , int j) {
		
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		
	}
	
	private static List<List<Integer>> getPermute(int [] nums , int i , List<List<Integer>>list ){
		
		if(i==nums.length) {
			List <Integer> current = new ArrayList<>();
			
			for(int elem : nums) {
				current.add(elem);
			}
			
			list.add(new ArrayList<>(current));
		return list;	
		}
		
		boolean [] flag = new boolean[21];
		
		for(int idx =i ; idx<nums.length ; idx++) {
			
			int pos= nums[idx]+10;
			
			if(!flag[pos]) {
				
				flag[pos]=true;
				
				getSwap(nums, i, idx);
				
				getPermute(nums, i+1, list);
				
				getSwap(nums, i, idx);
			}
			
		}
	return list;	
	}
	
	public static void main(String[] args) {
		
		int [] nums = {1,2,1};
		
		List<List<Integer>> list = new ArrayList<>();
		
		System.out.println(getPermute(nums, 0, list));
		
		
	}

}
