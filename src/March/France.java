package March;
import java.util.Arrays;
public class France {
	//1552. Magnetic Force Between Two Balls
	//Input: position = [1,2,3,4,7], m = 3
	//Output: 3
	private static boolean isPossible(int [] position , int m , int minAllowedDistance){
		int ball=1;
		int lastBallPos= position[0];
		
		for(int i=1 ; i<position.length ; i++) {
			if(position[i]-lastBallPos>=minAllowedDistance) {
				ball++;
				lastBallPos=position[i];
			}
			if(ball==m) 
				return true;
		}
	return false;	
	}
	public static void main(String[] args) {
		int [] position = {1,2,3,4,7};
		int m=3;
		
		Arrays.sort(position);
		
		int start=1;
		int end= position[position.length-1]-position[0];
		
		int ans=0;
		
		while(start<=end) {
			int mid= start+(end-start)/2;
			if(isPossible(position , m , mid)) {
				ans=mid;
				start=mid+1;
			}
			else 
				end=mid-1;
		}
		System.out.println(ans);
	}
}
