package challenges;

import java.util.Scanner;

public class Challenge_010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine().toLowerCase();
		
		boolean[] alphabet = new boolean[26];
		boolean allAlphabet = true;
		
		for (int i = 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if (c >= 'a' && c <= 'z') {
				alphabet[c - 'a'] = true;
			}
		}
		
		for (boolean b : alphabet) {
			if(!b) {
				allAlphabet = false;
				break;
			}
		}
		
		if (allAlphabet == true) {
			System.out.println("The sentence is a Pangram!");
		}
		else {
			System.out.println("The sentence is not a Pangram!");
		}
		
		sc.close();
		
	}

}