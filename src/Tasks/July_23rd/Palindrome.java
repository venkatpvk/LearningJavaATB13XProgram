package Tasks.July_23rd;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        // Taking input from the user
        System.out.println("Please enter a string");
        Scanner scanner = new Scanner(System.in);
        String usr_Input = scanner.next();

        // Reversing the user input string
        String rev_usr_input="";
        for (int i = 0; i < usr_Input.length(); i++) {
            rev_usr_input = usr_Input.charAt(i) + rev_usr_input;
        }

        // Print the user input and the reverse of the user input
        System.out.println("The user input is: "+usr_Input);
        System.out.println("The reverse of a user inpt is: " + rev_usr_input);


        // Checking if the user input is same when reversed using .equals() method
        System.out.println("*************************************************************************************************");

        System.out.println("Checking if the user input is same when reversed using .equals() method");
        if (usr_Input.equals(rev_usr_input)) {
            System.out.println("The given input is a palindrome");
        } else {
            System.out.println("The given input is not a palindrome");
        }

        System.out.println("*************************************************************************************************");

        // Checking if the user input is same when reversed using == approach

        System.out.println("Checking if the user input is same when reversed using == approach");

        if (usr_Input == rev_usr_input) {
            System.out.println("The given input is a palindrome");
        }else {
            System.out.println("The given input is not a palindrome");
        }

        System.out.println("*************************************************************************************************");
    }
}
