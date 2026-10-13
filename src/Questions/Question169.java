package Questions;

import java.util.*;
//Majority element
public class Question169 {
	
	private static int getMajorityUseMap(int [] nums) {
		//using map
		int majority=nums.length/2;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0 ; i<nums.length ; i++) {
			map.put(nums[i], map.getOrDefault(nums[i],0)+ 1);
		}
		
		for(int elem : nums) {
			if(map.get(elem)>majority) {
				return elem;
			}
		}
		return -1;
		
	}

	private static int getMajorityElem(int [] nums) {
		
		//Moore voting algo
		int ans = 0, freq = 0;

		for (int i = 0; i < nums.length; i++) {
			if (freq == 0) {
				ans = nums[i];
			}

			if (ans == nums[i]) {
				freq++;
			} else {
				freq--;
			}
		}

		int count = 0;

		for (int elem : nums) {
			if (elem == ans) {
				count++;
			}
			
			if (count > nums.length / 2) {
				return ans;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] nums = { 5,5,5,5,1,1,1,1,5};
		
		System.out.println(getMajorityElem(nums));
		//System.out.println(getMajorityUseMap(nums));


	}

}
