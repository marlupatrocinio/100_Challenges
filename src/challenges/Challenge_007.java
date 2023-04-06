package challenges;

import java.util.Scanner;

public class Challenge_007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		
		String a []= sentence.split(" "); //splits the input sentence into words and returns an array of Strings
	    String output = "";
	    for (String s:a){
	        output = output + s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";

	    }
	    System.out.println(output);
		
		sc.close();
	}

}
