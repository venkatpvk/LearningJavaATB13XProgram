package Tasks.July_3rd.MethodOverloading;

public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer();
//        printer.printData(10.2f);
//        printer.printData("Krishna");
        printer.printData(245);
    }

    void printData(String name) {
        System.out.println("The name is: " + name);
    }

    void printData(int number) {
        System.out.println("The number is: " + number);
    }

    void printData(float number) {
        System.out.println("The float number is: " + number);
    }
}
