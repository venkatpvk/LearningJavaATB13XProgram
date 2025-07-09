package Tasks.July_9th;

public class MultipleExceptionDemo {
    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6};


        int result = 0;
        try {
            result = array[2] / array[10];
        } catch (ArithmeticException e) {       // Arithmetic Exception
            System.out.println(e.getMessage());
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {     // Array index out of bounds exception
            System.out.println(e.getMessage());
            System.out.println("Array Index out of bounds exception");
        }

        System.out.println(result);
    }
}
