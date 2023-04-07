package challenges;

import java.util.Scanner;

public class Challenge_008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        int totalWordLength = 0;
        int wordCount = 0;

        for (String word : words) {

            String cleanedWord = word.replaceAll("[^a-zA-Z]", "");
            totalWordLength += cleanedWord.length();
            wordCount++;
        }

        double averageWordLength = (double) totalWordLength / wordCount;

        System.out.println("Average word length: " + averageWordLength);

        sc.close();
    }

}