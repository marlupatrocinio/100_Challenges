package application;

import java.util.Scanner;

public class Challenge_013 {

	/*
	 * Write a program that prompts the user to enter a sentence and counts the
	 * number of words in that sentence. A word is defined as a sequence of
	 * non-space characters separated by spaces.
	 */
	 public static void main(String[] args) {
		 
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a sentence: ");
	String sentence = sc.nextLine().trim();

	if(sentence.isEmpty())
	{
		System.out.println("No words found.");
	}else
	{
		String[] words = sentence.split(" ");
		int wordCount = words.length;
		System.out.println("Number of words: " + wordCount);
	}

	sc.close();
	}
}