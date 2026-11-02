package Questions;
import java.util.*;
//31. Next Permutation
public class Question31 {

	private static int[] reverse(int[] nums, int i, int j) {

		while (i <= j) {
			int temp = nums[i];
			nums[i++] = nums[j];
			nums[j--] = temp;
		}
		return nums;
	}

	private static int[] getNextPerm(int[] nums) {

		int piv = -1;

		// Step 1 :- find the pivot index
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				piv = i;
				break;
			}
		}

		if (piv == -1) {
			return reverse(nums, piv + 1, nums.length - 1);
		}

		// Step 2 :- Find the next greater element than pivot
		for (int i = nums.length - 2; i > piv; i--) {
			if (nums[piv] < nums[i]) {
				int temp = nums[i];
				nums[i] = nums[piv];
				nums[piv] = temp;

				break;
			}
		}

		// Step 3 :- Reverse the Number after pivot
		return reverse(nums, piv + 1, nums.length - 1);
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 5, 4, 1 };// 1 2 4 5 3 1

		System.out.println(Arrays.toString(getNextPerm(nums)));

	}

}
