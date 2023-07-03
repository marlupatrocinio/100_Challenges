package application;

import java.util.Scanner;

public class Challenge_014 {

	public static void main(String[] args) {

		/*
		Challenge 014: Word Count
		Write a program that reads a sentence from the user and counts the number of words in it.
		Assume that words in the sentence are separated by a single space and that there are no leading or trailing spaces.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		
		String[] splitStr = sentence.split(" ");
		
		int x = splitStr.length;
		
		System.out.println("Number of words: " + x);
		
		sc.close();
	}
}
