package ex_05_TypeCasting;

public class ExplicitNarrowing {
    public static void main(String[] args) {
        double number = 1234.56;

        // converting the double value to int
        int newNumber = (int) number;

        System.out.printf("The old double number is: %f \n", number);
        System.out.printf("The new integer number is: %d", newNumber);
    }

}
