package Tasks.June_23rd;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter an integer");
        Scanner scanner = new Scanner(System.in);
        int usr_input = scanner.nextInt();

        // Checking if the user input is positive or negative using If/Else
        if (usr_input > 0) {
            System.out.printf("The user input %d is a positive number", usr_input);
        } else if (usr_input == 0) {
            System.out.printf("The user input %d is zero value", usr_input);
        } else {
            System.out.printf("The user input %d is a negative number", usr_input);
        }
    }
}
