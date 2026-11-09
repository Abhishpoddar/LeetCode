package Questions;
//79. Word Search
public class Question79 {

	private static boolean checkWord(char [][] board ,String word , int i , int r, int c) {
		if(i==word.length()) {//To check whether we get complete word or not 
			return true;
		}
		
		if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]=='.') {
			return false;
		}
		
		
		if(board[r][c]==word.charAt(i)) {
			board[r][c]='.';
			boolean flag =checkWord(board , word , i+1 , r-1 , c)||//up
				checkWord(board , word , i+1 , r+1 , c)||//down
				checkWord(board , word , i+1 , r , c+1)||//right
				checkWord(board , word , i+1 , r , c-1); //left	
			board[r][c]=word.charAt(i);
			
			if(flag) {
				return true;
			}		
		}

	return false;	
	}
	
	
	private static boolean isPresent(char[] [] board , String word, int r , int c) {
		if(c==board[0].length) {
			r++;
			c=0;	
		}
		
		if(r==board.length) {
			return false;
		}
		
		if(board[r][c]==word.charAt(0) && checkWord(board , word , 0, r , c )){
			return true;
		}
			
	return isPresent(board , word ,r , c+1);	
	}
	
	
	
	
	public static void main(String[] args) {
		char [][] board = {
			    {'A', 'B', 'C', 'E'},
			    {'S', 'F', 'C', 'S'},
			    {'A', 'D', 'E', 'E'}
			};
		
		String word = "ABCB";
		
		System.out.println(isPresent(board , word , 0,0));
	}

}
