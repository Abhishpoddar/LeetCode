package April;
public class Niger {
	// 217. Contains Duplicate
	// Input: nums = [1,2,3,1]
	// Output: true
	//Slow fast pointer
	private static int findDuplicate(int[] nums) {

		int slow = nums[0];
		int fast = nums[0];

		do {
			slow = nums[slow];// One moment
			fast = nums[nums[fast]];// two moment
		} while (slow != fast);

		slow = nums[0];

		while (slow != fast) {// Both one one moment
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };

		System.out.println(findDuplicate(nums));
	}
}
