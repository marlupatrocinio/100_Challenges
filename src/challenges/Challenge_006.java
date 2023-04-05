package challenges;

import java.util.HashMap;
import java.util.Scanner;

public class Challenge_006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the words / sentence: ");
		
		String userInput = sc.nextLine();
		
		userInput = userInput.replaceAll("\\s+", "").toLowerCase();
		
		 HashMap<Character, Integer> hMap = new HashMap<>();
		 
		 for (int i = 0; i < userInput.length(); i++) {
			 char c = userInput.charAt(i);
	            if (hMap.containsKey(c)) {
	                hMap.put(c, hMap.get(c) + 1);
	            } else {
	                hMap.put(c, 1);
	            }
		 }
		
		 for (char c : hMap.keySet()) {
	            System.out.println(c + ": " + hMap.get(c));
		 }
		 
		sc.close();
	}

}
