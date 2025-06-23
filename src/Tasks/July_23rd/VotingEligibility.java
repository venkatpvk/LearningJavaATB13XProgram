package Tasks.July_23rd;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        // checking if the user is eligible to vote
        if (age >= 18) {
            System.out.println("The user can cast their vote");
        } else if (age <= 0) {
            System.out.println("The age user entered is not valid \nPlease enter your valid age");
        } else {
            System.out.println("The user is not old enough to cast their vote");
        }
    }
}
