package Tasks.July_9th;

import java.util.Scanner;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();

        int result = 0;
        try {
            result = num1 / num2;
            System.out.println(result);
            try {
                result = num1 / num2;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
