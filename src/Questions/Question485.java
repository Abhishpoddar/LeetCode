package Questions;
//485. Max Consecutive Ones
public class Question485 {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 0, 1, 1, 1 };

		int longest = 0;

		int count = 0;
		int i = 0;

		while (i < nums.length) {

			if (nums[i] == 1) {
				count++;
				longest = Math.max(longest, count);
			} 
			else {
				count = 0;
			}
			i++;
		}
		System.out.println(longest);
	}
}
