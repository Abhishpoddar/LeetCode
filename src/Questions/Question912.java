package Questions;
import java.util.*;
//Merge sort :- 912. Sort an Array
public class Question912 {
	
	private static void getMerge(int [] nums , int start , int mid , int end) {
		
		List<Integer> list = new ArrayList<>();
		
		int i=start;
		int j=mid+1;
		
		while(i<=mid && j<=end) {
			if(nums[i]<=nums[j]) {
				list.add(nums[i++]);
			}
			else {
				list.add(nums[j++]);
			}
		}
		
		while(i<=mid) {
			list.add(nums[i++]);
		}
		
		while(j<=end) {
				list.add(nums[j++]);
		}
		
		
		for(int idx=0; idx<list.size() ; idx++) {
			nums[start+idx]=list.get(idx);
		}
	}
	
	
	private static void getSort(int [] nums ,int start , int end) {
		
		int mid = start+(end-start)/2;
		
		if(start<end) {
			getSort(nums , start , mid);//Left half
			
			getSort(nums, mid+1, end);//Right Half
			
			getMerge(nums , start , mid , end);//Merge Both Halves
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int [] nums = {1,4,2,3,5};
		
		int start=0;
		int end =nums.length-1;
		
		getSort(nums, start, end);
		
		System.out.println(Arrays.toString(nums));
	}

}
