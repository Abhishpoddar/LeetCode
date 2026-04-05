package April;
import java.util.*;
public class Algeria {
	//54. Spiral Matrix
	private static List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		int srow=0 , erow=m-1;
		int scol=0 , ecol=n-1;
		
		List <Integer> list = new ArrayList<Integer>();
		while(srow<=erow && scol<=ecol) {
			//Top
			for(int i=scol ; i<=ecol ; i++) 
				list.add(matrix[srow][i]);
			
			//Right
			for(int j=srow+1 ; j<=erow ; j++) 
				list.add(matrix[j][ecol]);
			
			//Bottom
			for(int i=ecol-1 ; i>=scol ; i--) {
				if(srow==erow) 
					break;
				list.add(matrix[erow][i]);
			}
			
			//Left
			for(int j=erow-1 ; j>=srow+1 ; j--) {
				if(scol==ecol) 
					break;
				list.add(matrix[j][scol]);
			}
			
			srow++; scol++;
			ecol--; erow--;
		}
	return list;		
	}
	
	public static void main(String[] args) {
		int [] [] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		List <Integer> list = spiralOrder(matrix);
		
		for(int elem : list) {
			System.out.println(elem);
		}
	}
}