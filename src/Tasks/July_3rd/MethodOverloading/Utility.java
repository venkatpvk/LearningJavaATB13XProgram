package Tasks.July_3rd.MethodOverloading;

public class Utility {
    public static void main(String[] args) {
        Utility utility = new Utility();
        System.out.println(utility.max(10.2, 12));   // 12.0
        System.out.println(utility.max(4, 2));   //4
        System.out.println(utility.max(12, 3, 64));   //64
    }

    int max(int a, int b) {
        return Math.max(a, b);
    }

    int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    double max(double a, double b) {
        return Math.max(a, b);
    }
}
