package Tasks.June_27th;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Taking the input from the user
        System.out.println("Please enter the symbol you want");
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        System.out.println("Please enter the number of rows you want");
        int rows = scanner.nextInt();


        // Printing the triangle
        // loop to iterate for the given number of rows
        for (int i = 1; i <= rows; i++) {

            // loop to print the number of spaces before the star
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
    }
}
