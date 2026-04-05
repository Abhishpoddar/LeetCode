package April;
public class WesternSahara {
	// 74. Search a 2D Matrix
	// Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
	// Output: true
	private static boolean checkInRow(int [][]matrix , int target , int midRow) {
		int start=0;
		int end= matrix[0].length-1;
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			
			if(target==matrix[midRow][mid]) return true;
			
			else if(target<=matrix[midRow][mid]) end=mid-1;
			
			else start=mid+1;
		}
	return false;	
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length;
		int column = matrix[0].length;

		int startRow = 0;
		int endRow = row - 1;
		while (startRow <= endRow) {
			int midRow = startRow + (endRow - startRow) / 2;

			if (matrix[midRow][0] <= target && target <= matrix[midRow][column - 1]) 
				return checkInRow(matrix, target, midRow);
			 
			else if (target <= matrix[midRow][0]) 
				endRow = midRow - 1;
			
			else 
				startRow = midRow + 1;
		}
	return false;	
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
	
		System.out.println(searchMatrix(matrix, target));
	}
}