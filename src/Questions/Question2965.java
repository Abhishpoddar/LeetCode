package Questions;
import java.util.*;
//2965. Find Missing and Repeated Values
//Example 1:
//Input: grid = [[1,3],[2,2]]
//Output: [2,4]
public class Question2965 {
	
	public static void main(String[] args) {
		int [][] grid = {{1,3},{2,2}};
		int n= grid.length;
		
		int [] result= new int [2]; 
		
		int actualSum=0;
		
		Set<Integer>set = new HashSet<>();
		
		for(int i=0 ; i<grid.length ; i++) {
			for(int j=0 ; j<grid[0].length ; j++) {
				actualSum+=grid[i][j];
				
				
				if(set.contains(grid[i][j])) {
					result[0]=grid[i][j];
				}
				set.add(grid[i][j]);
			}
		}
		
		int sum = (n*n)*(n*n+1)/2;
		
		result[1]=sum+result[0]-actualSum;
		
		System.out.println(Arrays.toString(result));
			
	}

}
