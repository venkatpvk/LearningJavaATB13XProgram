package Tasks.July_3rd.MethodOverloading;

public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
//        greeter.greet();
        greeter.greet("Krishna");
    }

    void greet() {
        System.out.println("Hello");
    }

    void greet(String name) {
        System.out.println("Hello " + name);
    }
}
