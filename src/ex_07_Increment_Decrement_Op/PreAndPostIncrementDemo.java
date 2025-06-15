package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class PreAndPostIncrementDemo {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.printf("The number is: %d \n", num1);
        System.out.printf("Pre Increment of a number: %d \n", ++num1);
        System.out.printf("Post Increment of a number: %d \n", num1++);
        System.out.printf("The number after pre and post increment is: %d \n", num1);
    }
}
