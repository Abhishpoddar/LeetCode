package Questions;
import java.util.*;
//37. Sudoku Solver
public class Question37 {
	
	private static boolean isSafe(char[][] board , int row , int col , char elem) {
		
		
		//for horizontal check
		for(int i=0 ; i<board.length ; i++) {
			if(board[row][i]==elem) {
				return false;
			}
		}
		
		//For vertical check
		for(int j=0 ; j<board[0].length ; j++) {
			if(board[j][col]==elem) {
				return false;
			}
		}
		
		//For grid
		int r = (row/3)*3;
		int c = (col/3)*3;
		
		for(int i=r ; i<=r+2 ; i++) {
			for(int j=c ; j<=c+2 ; j++) {
				if(board[i][j]==elem) {
					return false;
				}
			}
		}
	return true;	
	}
	
	private static List<List<Character>> sudoku(char[][] board , int row , int col , List<List<Character>>list ) {
		if(row==9) {
			
			for(int i=0 ; i<board.length ; i++) {
				List<Character> current = new ArrayList<>();
				for(int j=0 ; j<board[i].length ; j++) {
					current.add(board[i][j]);
				}
				list.add(current);
			}	
		return list;
		}
		
		
		//for next position to be place
		int nextRow=row;
		int nextCol=col+1;
		
		if(nextCol==9) {
			nextRow=row+1;
			nextCol=0;
		}
		//Check whether the place is empty
		if(board[row][col]!='.') {
			//if place is not empty then move the next place for empty
			return sudoku(board, nextRow, nextCol  , list);
		}
		//If it is empty then fill
		else {
			
			
			//from the range of elements 
			for(char e='1' ; e<='9' ; e++) {
				//Checking whether the position is safe to introduce the current element
				if(isSafe(board , row , col , e)) {
					board[row][col]=e;
					//If placed then move to place next element
					sudoku(board, nextRow, nextCol, list);
					//If place is wrong then we back track
					board[row][col]='.';
				}
				
			}
		}
		
	return list;	
	}
	
	public static void main(String[] args) {
		char[][] board = {
			    {'5','3','.','.','7','.','.','.','.'},
			    {'6','.','.','1','9','5','.','.','.'},
			    {'.','9','8','.','.','.','.','6','.'},
			    {'8','.','.','.','6','.','.','.','3'},
			    {'4','.','.','8','.','3','.','.','1'},
			    {'7','.','.','.','2','.','.','.','6'},
			    {'.','6','.','.','.','.','2','8','.'},
			    {'.','.','.','4','1','9','.','.','5'},
			    {'.','.','.','.','8','.','.','7','9'}};
		
		List<List<Character>> list = new ArrayList<>();
		
		list =sudoku(board, 0, 0, list);
		
		for(List<Character> el : list) {
			System.out.println(el);
		}
		
		
	}

}
