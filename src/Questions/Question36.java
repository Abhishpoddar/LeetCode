package Questions;
//36. Valid Sudoku
public class Question36 {

	private static boolean isSafe(char[][] board, int row, int col, char elem) {

		// Check row wise
		for (int i = 0; i < board.length; i++) {
			if (board[row][i] == elem) {
				return false;
			}
		}

		// Check column wise
		for (int j = 0; j < board[0].length; j++) {
			if (board[j][col] == elem) {
				return false;
			}
		}

		// Check Grid wise
		int r = (row / 3) * 3;
		int c = (col / 3) * 3;

		for (int i = r; i <= r + 2; i++) {
			for (int j = c; j <= c + 2; j++) {
				if (board[i][j] == elem) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean isValidSudoku(char[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				char elem = board[i][j];
				if (elem != '.') {
					
					board[i][j]='.';
					
					if(!isSafe(board , i ,j, elem)) {
						return false;
					}
					board[i][j]=elem;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println(isValidSudoku(board));
	}

}
