package Questions;
import java.util.*;
//118. Pascal's Triangle
public class Question118 {
	
	public static List<List<Integer>> generate(int num , List<Integer> prev , List<List<Integer>>list){
		if(num==0) {
			return list;
		}
		
		List<Integer> current = new ArrayList<>();
		
		current.add(1);
		
		if(prev.size()>0) {
			for(int i=1 ; i<prev.size() ; i++) {
				current.add(prev.get(i-1)+ prev.get(i));
			}
			current.add(1);	
		}
		
		list.add(new ArrayList<>(current));
	return generate(num-1 , current , list);	
	}
	
	public static List<List<Integer>> generate(int num) {
		List<Integer> current = new ArrayList<>();
		List<List<Integer>>list = new ArrayList<>();
		
		return generate(num , current , list);
		
    }
	
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(generate(n));
	}

}
