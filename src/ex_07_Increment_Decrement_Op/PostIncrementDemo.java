package ex_07_Increment_Decrement_Op;

import java.util.Scanner;

public class PostIncrementDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();

        // Post increment the number and storing it
        int result = num1++;

        System.out.printf("num1: %d, \nresult: %d", num1, result);  //num1: 14, result: 13


    }

}
