package Tasks;

/*
Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination.
 */

import java.util.Scanner;

public class LeapYear {
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
