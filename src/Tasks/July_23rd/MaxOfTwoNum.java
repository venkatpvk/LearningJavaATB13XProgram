package Tasks.July_23rd;

import java.util.Scanner;

public class MaxOfTwoNum {
    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter an integer");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please enter an integer");
        int num2 = scanner.nextInt();

        // checking which number is larger
        if (num1 > num2) {
            System.out.printf("The first input %d is larger than second input %d", num1, num2);
        } else {
            System.out.printf("The first input %d is smaller than second input %d", num1, num2);
        }
    }
}
