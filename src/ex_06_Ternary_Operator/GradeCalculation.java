package ex_06_Ternary_Operator;

public class GradeCalculation {
    public static void main(String[] args) {
        int grade = 75;

        // Checking the grades using a ternary operator
        String result = grade<40?"Fail":grade==40?"C":grade==60?"B":grade==75?"A":grade==90?"A+":"Please give default value";
        System.out.printf("The grade is: %s",result);
    }
}
