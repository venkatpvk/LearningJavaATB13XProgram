package Tasks.July_23rd;

import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        String usr_input = scanner.next();

        int vowels = 0;
        int consonant = 0;

        // Looping through every letter in the word
        for (int i = 0; i < usr_input.length(); i++) {
            char letter = usr_input.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowels++;
            } else {
                consonant++;
            }
        }

        // Printing the number of vowels and consonants
        System.out.printf("The number of vowels in the user input is %d \n", vowels);
        System.out.printf("The number of consonants in the user input is %d", consonant);

    }
}
