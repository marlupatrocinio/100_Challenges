import java.util.Scanner;

public class Challenge_012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("Input: ");
        String input = sc.next().toLowerCase();

        for(int i = 0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u') {
                count++;
            }
        }
        System.out.println("Total vowels: " + count + ".");
        sc.close();
    }
}