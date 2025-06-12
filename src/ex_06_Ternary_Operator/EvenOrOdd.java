package ex_06_Ternary_Operator;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = -120;
        // Checking if the number is even or odd using ternary operator
        System.out.println(number % 2 == 0 ? "The given number is even " + number : "The given number is odd " + number);
    }
}
