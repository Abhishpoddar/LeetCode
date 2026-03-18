package March;
import java.util.*;
public class Denmark {
//	7️⃣ 4Sum
//	Find all quadruplets that sum to a target.
//	Reduce problem to two nested loops + two pointer pair sum.
//	Input: nums = [1,0,-1,0,-2,2], target = 0
//	Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
	public static void main(String[] args) {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {

			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			for (int j = i + 1; j < nums.length; j++) {
				int p = j + 1, q = nums.length - 1;

				while (p < q) {
					long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];

					if (sum == target) {
						System.out.println(nums[i] + " " + nums[j] + " " + nums[p] + " " + nums[q]);

						while (p < q && nums[p] == nums[p + 1])
							p++;
						while (p < q && nums[q] == nums[q - 1])
							q--;

						p++;
						q--;
					} else if (sum > target)
						q--;

					else
						p++;
				}
				j++;
				while (j < nums.length && nums[j] == nums[j - 1]) {
					j++;
				}
			}
		}
	}

}
