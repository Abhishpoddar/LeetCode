package May;

import java.util.*;

//Check if two strings are anagrams.
public class Congo {

	static Scanner congoInput = new Scanner(System.in);

	private static boolean checkAnagram(String string1, String string2) {

		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();

		if (string1.length() != string2.length())
			return false;

		int[] character = new int[26];

		for (int i = 0; i < string1.length(); i++) {

			character[string1.charAt(i) - 'a']++;
			character[string2.charAt(i) - 'a']--;
		}

		for (int i = 0; i < character.length; i++) {
			if (character[i] != 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		
		System.out.print("Enter the first String : ");
		String string1 = congoInput.next();
		System.out.println();

		System.out.print("Enter the another String : ");
		String string2 = congoInput.next();
		System.out.println();

		System.out.println(checkAnagram(string1, string2));
	}
}