package Tasks.June_24th;

import java.util.Scanner;

public class LargestOf2Num {
    public static void main(String[] args) {
        // Taking the input from the user
        System.out.println("Please enter the num1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Please enter the num2");
        int num2 = scanner.nextInt();

        // checking which num is largest
        if (num1 > num2) {
            System.out.println("The largest num is: " + num1);
        } else {
            System.out.println("The largest num is: "+num2);
        }
    }
}
