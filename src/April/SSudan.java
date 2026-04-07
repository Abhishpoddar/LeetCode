package April;
import java.util.*;
public class SSudan {
	//2965. Find Missing and Repeated Values
	//Input: grid = [[1,3],[2,2]] Output: [2,4]
	//Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
	private static int[] findMissingAndRepeatedValues(int[][] grid) {

		int[] result = new int[2];
		int n = grid.length;

		 Set<Integer> set = new HashSet<>();

		int actualSum = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				actualSum += grid[i][j];
				
				if (set.contains(grid[i][j])) 
					result[0] = grid[i][j];
				
				set.add(grid[i][j]);
			}		
		}
		//actual = expectedSum + missing -actualSum
		result[1] = (((n * n) * (n * n + 1)) / 2) + result[0] - actualSum;
		
	return result;
	}
	public static void main(String[] args) {
		int[][] grid = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
		System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
	}
}
