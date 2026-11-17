package Questions;
import java.util.*;
public class Question119 {
	
	public static List<Integer> getRow(int numRow) {
		List<Integer> list = new ArrayList<>();
		
		long value = 1;
		
		//Formula to calculate the each elem
		for(int i=0 ; i<=numRow ; i++) {
			list.add((int)value);
			value = value*(numRow-i)/(i+1);
		}
	return list;	
    }
	
	public static void main(String[] args) {
		int n = 3;
		
		System.out.println(getRow(n));
	}

}
