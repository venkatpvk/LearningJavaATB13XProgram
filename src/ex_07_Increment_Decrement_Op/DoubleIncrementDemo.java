package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class DoubleIncrementDemo {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        int result = num1++ + ++num1;  // 13 + 15 = 28

        System.out.printf("The result is: %d", result);
    }
}
