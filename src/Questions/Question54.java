package Questions;
import java.util.*;
//54. Spiral Matrix
public class Question54 {

	public static void main(String[] args) {

		int[][] mat = { { 1, 2, 3, 4 }, 
						{ 5, 6, 7, 8 }, 
						{ 9, 10, 11, 12 } };

		int sRow = 0, eRow = mat.length - 1;
		int sCol = 0, eCol = mat[0].length - 1;

		List<Integer> list = new ArrayList<>();

		while (sRow <= eRow && sCol <= eCol) {
			// Upper Bound
			for (int i = sCol; i <= eCol; i++) {
				list.add(mat[sRow][i]);
			}

			// Right bound
			for (int j = sRow + 1; j <= eRow; j++) {
				list.add(mat[j][eCol]);
			}

			// lower bound
				for (int i = eCol - 1; i >= sCol; i--) {
					if (sRow == eRow) {
						break;
					}
					list.add(mat[eRow][i]);
				
			}

			// Left bound

				for (int j = eRow - 1; j >= sRow + 1; j--) {
					if (sCol == eCol) {
						break;
					}
					list.add(mat[j][sCol]);
				}
				
				sRow++;
				eRow--;
				sCol++;
				eCol--;
				
		}

		System.out.println(list);
	}

}
