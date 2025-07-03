package Tasks.July_3rd.MethodOverloading;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10, 20);  // calling the int version of add method
        calculator.add(10.2, 23.1);  // calling the double add method
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }
}
