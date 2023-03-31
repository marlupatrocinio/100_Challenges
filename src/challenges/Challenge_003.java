package challenges;

import java.util.Scanner;

public class Challenge_003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int x = sc.nextInt();
		
		int[] data = new int[x];
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("Enter the element of the array " + (i+1) + " :");
			data[i] = sc.nextInt();
		}
		
		int max = data[0];
		
		for (int j = 0; j < data.length; j++) {
			if (data[j] > max) {
				max = data[j];
			}
		}
		
		System.out.println("Maximum element of the array: " + max);
		
		sc.close();
	}

}
