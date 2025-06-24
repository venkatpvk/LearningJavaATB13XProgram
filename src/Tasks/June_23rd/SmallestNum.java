package Tasks.June_23rd;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        // Taking input from the user
        System.out.println("Please enter an integer");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please enter an integer");
        int num2 = scanner.nextInt();

        // checking which number is smaller
        if (num1 < num2) {
            System.out.println("the samllest num is:"+num1);
        } else {
            System.out.println("the samllest num is:"+num2);
        }
    }
}
