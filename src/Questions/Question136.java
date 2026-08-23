package Questions;

public class Question136 {
	//136 : Single number
	public class SingleNumber {
		
		public static void main(String[] args) {
			int [] nums = {4,1,2,1,2};
			
			int ans=0;

	        for(int elem : nums){
	            ans ^=elem;
	        }
	        System.out.println(ans);//4
		}
	}


}
