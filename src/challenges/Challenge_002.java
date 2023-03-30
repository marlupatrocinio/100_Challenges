package challenges;

import java.util.Scanner;

public class Challenge_002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the String: ");
		String x = sc.next(); //the user chooses the word to reverse
		String y = ""; //this will store the final result
		
		char z; //this char is used to store the character
		
		for (int i = 0; i < x.length(); i++) {
			z = x.charAt(i);
			y = z + y;
			
		}
		System.out.println("reversed input: " + y);
		
		sc.close();
		
	}

}
