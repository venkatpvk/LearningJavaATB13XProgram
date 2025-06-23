package Tasks.July_23rd;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter an integer");
        Scanner scanner = new Scanner(System.in);
        int usr_input = scanner.nextInt();

        // checking if the number is even or odd
        if (usr_input % 2 == 0) {
            System.out.printf("The given number %d is a even number", usr_input);
        } else {
            System.out.printf("The given number %d is a odd number", usr_input);
        }
    }

}
