package challenges;

import java.util.Scanner;

public class Challenge_009 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word: ");
		String word = sc.nextLine();
		
		word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		String x = word;
		String y = "";
		
		for (int i = 0; i < x.length(); i++) {
			char z = x.charAt(i);
			y = z + y;
		}
		
		if (word.equals(y)) {
			System.out.println("The word is a palindrome!");
		}
		else {
			System.out.println("The word is not a palindrome!");
		}
		
		sc.close();
		
	}

}