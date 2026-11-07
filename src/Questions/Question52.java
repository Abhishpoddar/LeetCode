package Questions;
import java.util.*;
//52. N-Queens II
public class Question52 {
	
	private static boolean isSafe(char [][] board, int row , int col) {
		
		// Check column
		for(int j=0 ; j<row ; j++) {
			if(board[j][col]=='Q') {
				return false;
			}
		}
		
		// Check upper-left diagonal
		int k=row-1 , l=col-1;
		while(k>=0 && l>=0) {
			if(board[k][l]=='Q') {
				return false;
			}
			k--;
			l--;
		}
		
		// Check upper-right diagonal
		int m = row-1 , n = col+1;
		while(m>=0 && n <board.length) {
			if(board[m][n]=='Q') {
				return false;
			}
			m--;
			n++;
		}
		
	return true;	
	}
	
	private static List<List<String>> getQueens(char [][] board , int row , List<List<String>> list){
		
		if(row==board.length) {
			
			List<String> innerList= new ArrayList<>();
			
			for(int i=0 ; i<board.length ; i++) {
					innerList.add(new String(board[i]));
			}
			
			list.add(new ArrayList<>(innerList));
		return list;	
		}
		
		
		for(int i=0 ; i<board.length ; i++) {
			
			if(isSafe(board , row , i )) {
				
				board[row][i]='Q';
				getQueens(board, row+1, list);
				board[row][i]='.';
			}
		}
	return list;	
	}
	
	public static void main(String[] args) {
		
		int n = 4;
		
		char [][] board = new char[n][n];
		
		
		for(int i=0 ; i<board.length ; i++) {
			for(int j=0 ; j<board[i].length ; j++) {
				board[i][j]='.';
			}
		}
		
		List<List<String>> list = new ArrayList<>();
		
		
		list= getQueens(board, 0, list);
		System.out.println(list.size());
		
		
		
	
	}

}
