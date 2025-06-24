package Tasks.June_24th;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Please enter the year number");

        // Taking the input from the user
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        // Checking if the year is leap year or not using a if else conditions
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.printf("The year %d is a leap year", year);
        } else {
            System.out.printf("The year %d is not a leap year", year);
        }
    }
}
