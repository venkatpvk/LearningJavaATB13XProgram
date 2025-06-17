package ex_08_Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Please enter your input");
        Scanner scanner = new Scanner(System.in);
        String usr_input = scanner.next();
        String rev_input="";

        // reversing a string using for loop
        for (int i = 0; i < usr_input.length(); i++) {
            rev_input = usr_input.charAt(i)+rev_input;
        }
        System.out.println("User input is: "+usr_input);
        System.out.println("The reverse of a user input is: " + rev_input);

        if (usr_input.equals(rev_input)) {
            System.out.println("The user input is a palindrome");
        } else {
            System.out.println("The user input is not a plaindrome");
        }
    }
}
