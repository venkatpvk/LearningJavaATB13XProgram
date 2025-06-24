package Tasks.June_24th;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        // Taking the input from the user
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        // Checking if the user input is a prime number or not
        boolean isPrime = true;

        // Looping through all the number until the given input to find the factors
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        System.out.println(isPrime);

    }
}
