package Questions;
import java.util.Arrays;
//59. Spiral Matrix II
public class Question59 {
	
	public static void main(String[] args) {
		
		int [] [] mat = new int [3][3];
		
		int l=1;
		
		int sRow=0 ,eRow=mat.length-1;
		int sCol=0 ,eCol=mat[0].length-1;
		
		while(sRow<=eRow && sCol<=eCol) {
			
			//Upper Bound
			for(int i=sCol ; i<=eCol ; i++) {
				mat[sRow][i]=l++;
			}
			
			//Right Bound
			for(int j=sRow+1 ; j<=eRow ; j++) {
				
				
				mat[j][eCol]=l++;
			}
			
			//Lower Bound
			for(int i=eCol-1 ; i>=sCol ; i--) {
				if(sRow==eRow) {
					break;
				}
				mat[eRow][i]=l++;
			}
			
			//left bound
			for(int j=eRow-1 ; j>=sRow+1 ; j--) {
				if(sCol==eCol) {
					break;
				}
				mat[j][sCol]=l++;
			}
			
			sRow++;	eRow--;
			sCol++; eCol--;
		}
		
		System.out.println(Arrays.deepToString(mat));
	}

}
