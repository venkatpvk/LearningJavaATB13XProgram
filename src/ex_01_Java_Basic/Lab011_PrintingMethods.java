package ex_01_Java_Basic;

public class Lab011_PrintingMethods {
    public static void main(String[] args) {
        // To print the output in the console

        int num=9;

        for (int i = 1; i <= 10; i++) {
            int mul = num * i;
            System.out.printf("%d * %d = %d \n", num, i, mul);
        }
    }
}
