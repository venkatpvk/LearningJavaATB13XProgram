package Tasks.June_25th;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        intPalindrome();
    }

    static void stringPalindrome() {
        // Taking the input from the user
        System.out.println("Please enter your input");
        Scanner scanner = new Scanner(System.in);
        String usr_input = scanner.next();

        // Loop through to reverse the user input
        String reversedString = "";
        for (int i = 0; i < usr_input.length(); i++) {
            reversedString = usr_input.charAt(i) + reversedString;
        }

        if (usr_input.equals(reversedString)) {
            System.out.println("The given user input is a PALINDROME");
        } else {
            System.out.println("The given user input is not a PALINDROME");
        }
    }

    static void intPalindrome() {
        // Taking the input from the user
        System.out.println("Please enter your input");
        Scanner scanner = new Scanner(System.in);
        int usr_input = scanner.nextInt();

        // Checking if the reverse of a user input is same as user input
        int reversed = 0;
        int temp = usr_input;
        while (temp != 0) {

            int digit = temp % 10;  // getting the last digit
            reversed = reversed * 10 + digit;  // Making the reversed num
            temp /= 10;  // removing the last digit
        }

        System.out.printf("The user input is: %d\n", usr_input);
        System.out.printf("The reverse of user input is: %d\n", reversed);

        if (usr_input == reversed) {
            System.out.println("The given input is a palindrome");
        } else {
            System.out.println("The given input is not a palindrome");
        }

    }
}
