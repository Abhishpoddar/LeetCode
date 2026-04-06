package April;
import java.util.*;
public class Sudan {
	//2643. Row With Maximum Ones
	//Input: mat = [[0,0,0],[0,1,1]]
	//Output: [1,2]
	private static int[] rowAndMaximumOnes(int[][] mat) {

        int row=0;
        int maxSum=0;

        for(int i=0 ; i<mat.length; i++){
            int sum=0;
            for(int j=0 ; j<mat[i].length ; j++)
                sum +=mat[i][j];

            if(maxSum<sum){
                maxSum= sum;
                row = i;
            }
        }
    return new int []{row , maxSum};       
    }
	
	public static void main(String[] args) {
		int [][]mat = {{0,0,0},{0,1,1}};
		
		System.out.println(Arrays.toString(rowAndMaximumOnes(mat)));
	}

}
