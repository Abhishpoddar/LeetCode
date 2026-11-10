package Questions;
//2148. Count Elements With Strictly Smaller and Greater Elements 
public class Question2148 {
	
	private static  int getNumber(int [] nums) {
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int elem : nums) {
			max = Math.max(elem, max);
			min = Math.min(elem, min);
		}
		
		
		int count=0;
		
		for(int elem : nums) {
			if(min<elem && elem<max) {
				count++;
			}
		}
	return count;	
	}

	public static void main(String[] args) {

		int[] nums = { 2, 5, 7, 9 };
		
		System.out.println(getNumber(nums));

	}

}
