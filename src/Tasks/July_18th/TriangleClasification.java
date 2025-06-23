package Tasks.July_18th;

import java.util.Scanner;

public class TriangleClasification {
    public static void main(String[] args) {
        System.out.println("Please give 3 inputs");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All the 3 inputs are equal so it is a Equilateral Triangle ");
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Two sides are equal so it is Isosceles triangle");
        } else {
            System.out.println("No sides are equal so it is a scalene triangle");
        }
    }
}
