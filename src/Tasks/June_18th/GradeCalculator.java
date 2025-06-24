package Tasks.June_18th;

/*
Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:

A: 90-100

B: 80-89

C: 70-79

D: 60-69

F: 0-59
 */

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter the student marks");

        // Taking the input from the user
        Scanner scanner = new Scanner(System.in);
        int studentMarks = scanner.nextInt();

        // Using conditional statement to determine the grade
        if (studentMarks >= 0 && studentMarks <= 59) {
            System.out.println("The student grade is: " + "F");
        } else if (studentMarks >= 60 && studentMarks <= 69) {
            System.out.println("The student grade is: "+"D");
        } else if (studentMarks >= 70 && studentMarks <= 79) {
            System.out.println("The student grade is: "+"C");
        } else if (studentMarks >= 80 && studentMarks <= 89) {
            System.out.println("The student grade is: "+"B");
        } else if (studentMarks >= 90 && studentMarks <= 100) {
            System.out.println("The student grade is: " + "A");
        } else {
            System.out.println("Please enter a valid marks");
        }
    }
}
