package Tasks.July_9th;

import java.util.Scanner;

public class GenericCatch {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        try {
            num1 = scanner.nextInt();
            System.out.println("Enter second number");
            num2 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int result = 0;
        try {
            result = num1 / num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
