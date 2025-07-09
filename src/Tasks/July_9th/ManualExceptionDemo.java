package Tasks.July_9th;

public class ManualExceptionDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1 / num2;
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
