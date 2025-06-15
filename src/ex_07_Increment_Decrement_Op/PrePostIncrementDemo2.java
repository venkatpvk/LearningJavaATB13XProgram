package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class PrePostIncrementDemo2 {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); // 5
        System.out.printf("The number is: %d \n", num1);

        int result = num1++ + ++num1;
        System.out.printf("The number after increment is: %d \n", num1); // 7
        System.out.printf("The result of the increment is: %d \n", result); // 12
    }
}
