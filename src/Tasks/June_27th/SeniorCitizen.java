package Tasks.June_27th;

import java.util.Scanner;

public class SeniorCitizen {
    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        // Checking if the person is a senior citizen or not
        if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior Citizen");
        } else {
            System.out.println("Please enter your valid age");
        }

    }
}
