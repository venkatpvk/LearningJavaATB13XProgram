package Tasks.July_9th;

import java.util.Scanner;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
