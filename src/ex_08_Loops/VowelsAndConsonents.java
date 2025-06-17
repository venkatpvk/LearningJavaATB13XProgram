package ex_08_Loops;

import java.util.Scanner;

public class VowelsAndConsonents {
    public static void main(String[] args) {

        System.out.println("Please enter a string: ");
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        String usr_input = scanner.next();

        int vowels = 0;
        int consonents = 0;

        // Using for loop to detect number of vowels and consonants
        for (int i = 0; i < usr_input.length(); i++) {
            if (usr_input.charAt(i) == 'a' || usr_input.charAt(i) == 'e' || usr_input.charAt(i) == 'i' || usr_input.charAt(i) == 'o' || usr_input.charAt(i) == 'u') {
                vowels += 1;
            } else {
                consonents += 1;
            }
        }

        System.out.printf("In the given input there are %d vowels and %d consonants", vowels, consonents);

    }
}
