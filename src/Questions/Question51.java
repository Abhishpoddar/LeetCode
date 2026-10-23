package Questions;
import java.util.*;
//51. N-Queens
public class Question51 {
	
	private static boolean isSafe(char[][]board  , int row, int j , int n) {
		
		//Same row
		for(int i=0 ; i<row ; i++) {
			if(board[row][i]=='Q') {
				return false;
			}
		}
		
		//Same column
		for(int i=0 ; i<n ; i++) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		
		//Left diagonal
		for(int r=row , c=j ; r>=0 && c>=0 ; r-- ,c--) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
		
		//for right column
		for(int r=row , c=j ; r>=0 && c<n ; r--, c++) {
			if(board[r][c]=='Q') {
				return false;
			}
		}
	return true;	
	}
	
	public  static List<List<String>> solveNQueens(char[][]board , int row , int n , List<List<String>> ans) {

        if(row==n) {
        	
        	List<String> parts = new ArrayList<>();
        	
        	for(int i=0 ; i<n ; i++) {
              		parts.add(new String(board[i]));
        	}
        	
        	ans.add(new ArrayList<>(parts));
        	return ans;
        }
        

        for(int j=0 ; j<n ; j++){

            if(isSafe(board , row , j , n)){
            	
                board[row][j]='Q';
                
                solveNQueens(board, row+1, n, ans);
                
                board[row][j]='.';
            }
        } 
     return ans;   
    }
	
	public static void main(String[] args) {
		
		int n=4;
		
		List<List<String>> ans = new ArrayList<>();
		
		char[][] board = new char[n][n];
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				board[i][j]='.';
			}
		}
		
		System.out.println(solveNQueens(board, 0, n, ans));
	}
}
