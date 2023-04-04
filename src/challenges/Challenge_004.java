package challenges;

import java.util.Scanner;

public class Challenge_004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to check if it's prime or not:");
		int number = sc.nextInt();
		boolean prime = true;

		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println("This is a prime number!");
		} else {
			System.out.println("This is not a prime number!");
		}

		sc.close();

	}
}