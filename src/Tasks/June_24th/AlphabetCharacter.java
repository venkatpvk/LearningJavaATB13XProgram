package Tasks.June_24th;

import java.util.Scanner;

public class AlphabetCharacter {
    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter a Character");
        Scanner scanner = new Scanner(System.in);
        char usr_input = scanner.next().toLowerCase().charAt(0);


        // Checking if the user input is a alphabet
        if (usr_input >= 97 && usr_input <= 122) {
            System.out.println("The user input is a alphabet, the user input is " + usr_input);
        } else {
            System.out.println("The user input is not a alphabet, the user input is "+usr_input);
        }

    }
}
