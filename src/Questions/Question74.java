package Questions;
//74. Search a 2D Matrix
public class Question74 {
	
	private static boolean getCell(int [][] mat , int target , int midRow) {
		
		int startCol=0;
		int endCol=mat[0].length-1;
		
		while(startCol<=endCol) {
			int midCol= startCol+(endCol-startCol)/2;
			
			if(target==mat[midRow][midCol]) {
				return true;
			}
			else if(target<mat[midRow][midCol]) {
				endCol=midCol-1;
			}
			else {
				startCol=midCol+1;
			}
		}
	return false;	
	}
	public static void main(String[] args) {
		
		int [][] mat= {{1,2,3},{4,5,6},{7,8,9}};
		int target=3;
		
		int startRow=0;
		int endRow=mat.length;
		
		
		while(startRow<=endRow) {
			int midRow = startRow+(endRow-startRow)/2;
			
			if(mat[midRow][0]<=target && target <=mat[midRow][mat[0].length-1]) {
				
				System.out.println(getCell(mat , target ,midRow)); 
				return;
			}
			else if(target<=mat[midRow][0]) {
				endRow=midRow-1;
			}
			else {
				startRow=midRow+1;
			}
		}
	}

}
