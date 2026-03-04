package month1;

import java.util.Arrays;

public class Vietnam {
	//Merge Sorted Array
	//Merge two sorted arrays in-place.
	

    public static void main(String[] args) {
		int [] nums1 = {1,2,3,0,0,0};
		int [] nums2 = {2,5,6};
		int m = 3;
		
		 int j=0;
	        for(int i=m ; i<nums1.length ; i++){
	            nums1[i]=nums2[j++];
	        }

	        Arrays.sort(nums1);
	        
	        for(int num : nums1) {
	        	System.out.println(num);
	        }
	}



}
