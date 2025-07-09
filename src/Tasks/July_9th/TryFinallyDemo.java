package Tasks.July_9th;

public class TryFinallyDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try{
            int result = num1 / num2;
        }finally {
            System.out.println("This is finally block");
        }
    }
}
