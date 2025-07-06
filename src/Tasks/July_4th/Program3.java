package Tasks.July_4th;

public class Program3 {
    int num1 = 10;
    int num2 = 20;
    String name = "Parent";

    public static void main(String[] args) {
        p3 p3 = new p3();
        p3.display();
    }

}

class p3 extends Program3{
    int num1=100;
    int num2=200;
    String name = "Child";

    void display(){
        System.out.printf("The child info is: %d, %d, %s\n", num1, num2, name);

        System.out.println("*******************************************************");

        System.out.printf("The parent info is: %d, %d, %s\n", super.num1, super.num2, super.name);

    }




}
