package ex_08_Loops;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int usr_input = scanner.nextInt();

        // Using while loop to print even number in the given rage
        while (usr_input >= 2) {
            if (usr_input % 2 == 0) {
                System.out.printf("The number %d is even \n", usr_input);
                usr_input--;
            } else {
                System.out.printf("The number %d is odd \n", usr_input);
                usr_input--;
            }
        }
    }
}
