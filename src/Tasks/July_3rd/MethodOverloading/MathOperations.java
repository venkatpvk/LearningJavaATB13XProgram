package Tasks.July_3rd.MethodOverloading;

public class MathOperations {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
//        mathOperations.multiply(10,20, 30);
        mathOperations.multiply(10,20);

    }

    void multiply(int a, int b){
        System.out.println("Multiplication of 2 integers is: " + (a * b));
    }

    void multiply(int a, int b, int c){
        System.out.println("Multiplication of 3 integers is: " + (a * b * c));
    }
}
