package challenges;

import java.util.Scanner;

public class Challenge_005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the integer #1: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the integer #2: ");
		int y = sc.nextInt();
		
		System.out.println("Division quotient = " + x/y);
		
		System.out.println("Division reminder = " +  x%y);
		
		sc.close();
	}

}
