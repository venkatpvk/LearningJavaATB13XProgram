package Tasks.July_9th;

import java.util.Scanner;

public class TryWithMultipleStatements {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        try {
            num1 = scanner.nextInt();
            System.out.println("Enter second number");
            num2 = scanner.nextInt();

            result = num1 / num2;
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
