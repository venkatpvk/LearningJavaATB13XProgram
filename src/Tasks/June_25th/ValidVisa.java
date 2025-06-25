package Tasks.June_25th;

import java.util.Scanner;

public class ValidVisa {
    public static void main(String[] args) {
        // Taking the input from the user
        System.out.println("Please enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.println("Please enter the details about your visa");
        boolean visa = scanner.nextBoolean();


        // Checking if the user has valid age and visa to travel
        if (age >= 0) {
            if (age > 18 && visa) {
                System.out.println("The user is eligible for travelling");
            } else {
                System.out.println("The user is not eligible for travelling");
            }
        } else {
            System.out.println("The age of the user should be positive number only");
        }
    }
}
