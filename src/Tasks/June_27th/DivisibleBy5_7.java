package Tasks.June_27th;

import java.util.Scanner;

public class DivisibleBy5_7 {
    public static void main(String[] args) {
        // Taking the input from the user
        System.out.println("Please enter any number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        // Checking if the number is divisible by 5 & 7
        if (number % 5 == 0 && number % 7 == 0) {
            System.out.printf("The number %d is divisible by both 5 and 7", number);
        } else {
            System.out.printf("The number %d is not divisible by 5 or 7", number);
        }
    }
}
