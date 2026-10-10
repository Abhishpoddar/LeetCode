package Questions;
//1572. Matrix Diagonal Sum
public class Question1572 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int diagonalSum = 0;

		for (int i = 0; i < matrix.length; i++) {
			diagonalSum += matrix[i][i];
			if (i != matrix.length - 1 - i) {
				diagonalSum += matrix[i][matrix.length-1-i];
			}
		}
		System.out.println(diagonalSum);
	}

}
