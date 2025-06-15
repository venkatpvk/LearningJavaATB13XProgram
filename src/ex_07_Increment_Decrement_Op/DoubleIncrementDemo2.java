package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class DoubleIncrementDemo2 {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.printf("result is: %d", (num1++ + ++num1)); // 5 + 7 = 12
    }
}
