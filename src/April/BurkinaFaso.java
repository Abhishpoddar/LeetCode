package April;
public class BurkinaFaso {
	//414. Third Maximum Number
	public static void main(String[] args) {
		int [] nums = {1,2,3};
		
		Integer max1 = null;
		Integer max2 = null;
		Integer max3 = null;
		
		for(Integer elem : nums) {
			
			if(elem.equals(max1)|| elem.equals(max2)|| elem.equals(max3)) 
				continue;
			
			if(max1==null || max1<elem) {
				max3=max2;
				max2=max1;
				max1=elem;
			}
			else if(max2==null || max2<elem) {
				max3=max2;
				max2=elem;
			}
			else if(max3==null || max3<elem){
				max3=elem;
			}
		}
		System.out.println(max3==null ? max1 : max3);
	}
}
