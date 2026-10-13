package Questions;

public class Question258 {

	public static int addDigits(int num) {

		if (num >= 0 && num <= 9) {
			return num;
		}

		if (num % 9 == 0) {
			return 9;
		}

		return num % 9;
	}

	public static void main(String[] args) {
		int num = 345;
		
		System.out.println(addDigits(num));

	}

}
