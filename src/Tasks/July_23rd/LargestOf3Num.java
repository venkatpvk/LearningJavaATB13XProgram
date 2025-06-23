package Tasks.July_23rd;

import java.util.Scanner;

public class LargestOf3Num {
    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter num1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please enter num2");
        int num2 = scanner.nextInt();
        System.out.println("Please enter num3");
        int num3 = scanner.nextInt();

        // checking which number is the largest of all
        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }
}
