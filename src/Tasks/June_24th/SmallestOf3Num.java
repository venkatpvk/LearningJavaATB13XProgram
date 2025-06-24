package Tasks.June_24th;

import java.util.Scanner;

public class SmallestOf3Num {
    public static void main(String[] args) {

        // Taking the input from the user
        System.out.println("Please enter the num1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please enter the num2");
        int num2 = scanner.nextInt();
        System.out.println("Please enter the num3");
        int num3 = scanner.nextInt();

        // Checking which is the smallest num in the given input
        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest num is: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest num is: " + num2);
        } else {
            System.out.println("The smallest num is: "+num3);
        }


    }
}
