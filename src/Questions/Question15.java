package Questions;
import java.util.*;

public class Question15 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 0, 1, 0, 0, 0, 0 };

		Arrays.sort(nums);// 0,0,0,0,0,1,1,2

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {

				int sum = nums[i] + nums[j] + nums[k];

				if (sum == 0) {

					list.add(Arrays.asList(nums[i], nums[j], nums[k]));

					while (j < k && nums[j] == nums[j + 1]) {
						j++;
					}

					while (j < k && nums[k] == nums[k - 1]) {
						k--;
					}

					j++;
					k--;
				} else if (sum < 0) {
					j++;
				} else {
					k--;
				}
			}

		}

		System.out.println(list);

	}

}
