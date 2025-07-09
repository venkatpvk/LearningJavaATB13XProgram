package Tasks.July_9th;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        int result = 0;
        try {
            result = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Division by zero is not acceptable");
        }
        System.out.println(result);
    }
}
