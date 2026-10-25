package Questions;

import java.util.Arrays;
//88. Merge Sorted Array
public class Question88 {
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {

	        int i=m-1;
	        int j=m+n-1;
	        int k=n-1;

	        while(k>=0){
	            if( i>=0 && nums1[i]>nums2[k]){
	                nums1[j--]=nums1[i--];
	            }
	            else {
	                nums1[j--]=nums2[k--];
	            }
	        }        
	    }
	 
	 public static void main(String[] args) {
		int []  nums1 = {1,2,3,0,0,0};
		int m = 3;
		int [] nums2 = {2,5,6};
		int n = 3;
		
		merge(nums1,m,nums2,n);
		System.out.println(Arrays.toString(nums1));
				 
	}

}
