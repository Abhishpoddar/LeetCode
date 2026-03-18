package March;

public class Afganistan {
		//Remove Duplicates from Sorted Array
		//Modify array in-place so each element appears once.
		
		public static void main(String[] args) {
			int [] nums = {0,0,3,4,5,6,7};//Answer is new length :- 6
			
			int [] array = new int [nums.length];
			
			int i=0;
			array[i]=nums[0];
			
			for(int j=1 ; j<nums.length ; j++) {
				if(array[i]!=nums[j]) {
					array[i+1]=nums[j];
					i++;
				}
			}
			System.out.println(i+1);
		}


}
