package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class DoublePreAndPostIncrementDemo {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.printf("The number before increment is: %d \n", num1);

        int result = num1++ + ++num1 + num1++ + ++num1;
//                      5   +   7    +  7     +  9 = 28
        System.out.printf("The number after increment is: %d \n", num1);
        System.out.printf("The result of the pre and post increment is: %d \n", result);
    }
}
