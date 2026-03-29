package March;
public class Portugal {
	//88. Merge Sorted Array
	//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
	//Output: [1,2,2,3,5,6]
	//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
	public static void main(String[] args) {
		int [] nums1 = {1,2,3,0,0,0}; int m=3;
		int [] nums2 = {2,5,6}; int n=3;
		
		int i=m-1;
		int j=n-1;
		int index=nums1.length-1;
		
		while(j>=0 && i>=0){
			if(nums1[i]>=nums2[j]) 
				nums1[index--]=nums1[i--];
			
			else 
				nums1[index--]=nums2[j--];
		}
		
		while(j>=0) 
			nums1[index--]=nums2[j--];
		
		for(int ele : nums1) 
			System.out.println(ele);
	}
}
