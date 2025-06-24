package Tasks.June_24th;

/*
Marks Range Grade

90 - 100   A+

80 - 89     A

70 - 79      B

60 - 69     C

50 - 59      D

40 - 49      E

Below 40   Fail
 */

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        System.out.println("Please enter the student marks");

        // Taking the input from the user
        Scanner scanner = new Scanner(System.in);
        int studentMarks = scanner.nextInt();

        // Using conditional statement to determine the grade
        if (studentMarks >= 0 && studentMarks < 40) {
            System.out.println("The student grade is: " + "F");
        } else if (studentMarks >= 40 && studentMarks <= 49) {
            System.out.println("The student grade is: "+"E");
        } else if (studentMarks >= 50 && studentMarks <= 59) {
            System.out.println("The student grade is: "+"D");
        } else if (studentMarks >= 60 && studentMarks <= 69) {
            System.out.println("The student grade is: "+"C");
        } else if (studentMarks >= 70 && studentMarks <= 79) {
            System.out.println("The student grade is: " + "B");
        }else if (studentMarks >= 80 && studentMarks <= 89) {
            System.out.println("The student grade is: " + "A");
        }else if (studentMarks >= 90 && studentMarks <= 100) {
            System.out.println("The student grade is: " + "A+");
        } else {
            System.out.println("Please enter a valid marks");
        }
    }
}
