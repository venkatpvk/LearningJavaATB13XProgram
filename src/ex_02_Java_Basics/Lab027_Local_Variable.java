package ex_02_Java_Basics;

public class Lab027_Local_Variable {
    public static void main(String[] args) {
        int a = 10;
        {
            int b = 10;
            System.out.println(b);
        }
        int b = 90;
        System.out.println(b);
    }
}
