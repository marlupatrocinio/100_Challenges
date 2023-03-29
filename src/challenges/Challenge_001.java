package challenges;

import java.util.Scanner;

public class Challenge_001 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("provide the n terms for the Fibonacci series:");
	int n = sc.nextInt();
	int a = 1;
	int b = 0;
	int aux;

	for (int i = 0; i < n; i++) {
		System.out.println(a);
		aux = a;
		a = a + b;
		b = aux;
		}
	sc.close();

}
}