package ex_05_TypeCasting;

public class DivisionTypeCasting {
    public static void main(String[] args) {
        int num1 = 95;
        int num2 = 3;

        float result = (float) num1 / num2;

        System.out.printf("The result of division between %d and %d is: %f", num1, num2, result);
    }
}
