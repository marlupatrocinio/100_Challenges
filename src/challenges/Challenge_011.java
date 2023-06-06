import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge_011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = sc.nextLine().toLowerCase();

        Map<Character, Integer> frequencyMap = new HashMap();
        for(char c : input.toCharArray()) {
            if (Character.isLetter(c)){
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) +1);
            }
        }

        frequencyMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println("- '" + entry.getKey() + "': " + entry.getValue()));

    sc.close();
    }
}
