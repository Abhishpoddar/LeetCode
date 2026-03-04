package month1;

public class Singapore {
	// 75 : Sort Colors (Dutch National Flag)
	// Sort 0s, 1s, and 2s in-place

	public static void main(String[] args) {
		int [] nums = {0,2,1,0,2,1};
		int i = 0;
		int j = 0;
		int k = 0;

		for (int l = 0; l < nums.length; l++) {
			if (nums[l] == 0) {
				i++;
			} else if (nums[l] == 1) {
				j++;
			} else {
				k++;
			}
		}
		int l = 0;
		while (l < i) {
			nums[l] = 0;
			l++;
		}

		while (l < j + i) {
			nums[l] = 1;
			l++;
		}
		while (l < j + i + k) {
			nums[l] = 2;
			l++;
		}
	}

}
