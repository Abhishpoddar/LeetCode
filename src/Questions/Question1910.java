package Questions;
//1910. Remove All Occurrences of a Substring
public class Question1910 {
	
	private static String removeOccurrences(String str, String part) {

        while(str.contains(part)){
            int index = str.indexOf(part);
            

            str = str.substring(0 , index) +
                    str.substring(index+part.length() , str.length());
        }
    return str;
    }

	public static void main(String[] args) {
		String str = "daabcbaabcbc";
		String part="abc";
		
		System.out.println(removeOccurrences(str, part));
	}

}
