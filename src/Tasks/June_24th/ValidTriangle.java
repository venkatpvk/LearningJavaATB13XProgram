package Tasks.June_24th;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        // Taking the triangle sides from the user
        System.out.println("Please enter the value of the first side");
        Scanner scanner = new Scanner(System.in);
        int sideOne = scanner.nextInt();
        System.out.println("Please enter the value of the second side");
        int sideTwo = scanner.nextInt();
        System.out.println("Please enter the value of the third side");
        int sideThird = scanner.nextInt();


        // Checking if it is a valid triangle, If sum of any two sides is greater than the 3rd side then it is a valid triangle
        if ((sideOne + sideTwo > sideThird) && (sideOne + sideThird > sideTwo) && (sideTwo + sideThird > sideOne)) {
            System.out.println("The given input makes a valid triangle");
        } else {
            System.out.println("The given input doesn't make a valid triangle");
        }

    }
}
