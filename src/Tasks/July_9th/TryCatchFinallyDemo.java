package Tasks.July_9th;

import java.util.Scanner;

public class TryCatchFinallyDemo {
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
