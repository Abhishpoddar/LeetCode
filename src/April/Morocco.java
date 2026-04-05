package April;
public class Morocco {
	//240. Search a 2D Matrix II
	//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]],
	//target = 5  Output: true
	private static boolean searchMatrix(int[][] matrix, int target) {
		int row =0;
		int column= matrix[0].length-1;
		
		while(row<matrix.length && column>=0) {
			
			if(target==matrix[row][column]) 
				return true;
			
			else if(target<matrix[row][column]) 
				column--;
			
			else if(target>matrix[row][column]) 
				row++;
		}
	return false;	
	}
	
	public static void main(String[] args) {
		int [] [] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		int target=6;
		
		System.out.println(searchMatrix(matrix, target));
	}
}
