package Questions;

//Sieve of Aresthosthenese
public class Question204 {


	public static void main(String[] args) {

		int num = 50;
		int count = 0;

		boolean[] flag = new boolean[num + 1];

		for (int i = 2; i <= num; i++) {
			if (!flag[i]) {
				flag[i] = true;
				count++;

				for (int j = i * 2; j <= num; j = i + j) {
					flag[j] = true;
				}
			}
		}
		System.out.println(count);
	}
}
