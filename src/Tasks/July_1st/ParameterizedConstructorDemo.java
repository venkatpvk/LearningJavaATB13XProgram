package Tasks.July_1st;

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2(10, 20);
    }
}

class Demo2{

    // Parameterized constructor demo
    // This constructor takes two arguments and add them
    Demo2(int a, int b) {
        System.out.printf("Sum of %d and %d is: %d", a,b, (a+b));
    }

}
