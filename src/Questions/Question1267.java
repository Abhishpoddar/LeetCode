package Questions;
//1267. Count Servers that Communicate
public class Question1267 {
	
	private static boolean isCommunicate(int [][] grid , int row , int col) {
		
		for(int i=0 ; i<grid.length ; i++) {
			if(i!=col && grid[row][i]==1) {
				return true;	
			}
		}
		
		for(int j=0 ; j<grid[0].length ; j++) {
			if(j!=row && grid[j][col]==1) {
				return true;	
			}
		}
		
	return false;	
	}
	
	public static void main(String[] args) {
		
		int [][] grid = {{1,0},{1,1}};
		
		int count=0;
		
		for(int i=0 ; i<grid.length ; i++) {
			for(int j=0 ; j<grid[0].length ; j++) {
				if(grid[i][j]==1 && isCommunicate(grid, i, j)) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		
	}

}
