package March;

public class Luxembourg {
//	410. Split Array Largest Sum
//	nums = [7, 2, 5, 10, 8], k = 2
//	output =18
	private static boolean isValid(int [] books , int students , int maxPages) {
		
		int student=1;
		int pages=0;
		
		for(int i=0 ; i<books.length ; i++) {
			if(books[i]>maxPages) {
				return false;
			}
			
			if(pages+books[i]<=maxPages) {
				pages +=books[i];
			}
			else {
				pages=books[i];
				student++;
			}
		}
		
		return student>students ? false : true;
	}
	
	public static void main(String[] args) {
		int [] nums = {7,2,5,10,8};
		int k=2;

		int start=0;
		int sum=0;
		
		for(int i=0 ; i<nums.length ; i++) {
			start = Math.max(start, nums[i]);
			sum +=nums[i];
		}
		
		int end=sum;
		
		int ans=0;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(isValid(nums , k ,mid)) {
				ans=mid;
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		System.out.println(ans);
	}
}
