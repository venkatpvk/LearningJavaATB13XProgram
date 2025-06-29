package Tasks.June_27th;

import java.util.Scanner;

/*
 Convert Days into Years, Months, and Days.

       :- Take the Days Input from the User

    Define the conversion logic:

        :- Assume 1 year = 365 days.

        :- Assume 1 month = 30 days

        :- Convert the Days into Years, Month and days and Print it.

if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
 */

public class DateConversion {
    public static void main(String[] args) {
        // Taking the input from the user
        System.out.println("Please enter the days");
        Scanner scanner = new Scanner(System.in);
        int totalDays = scanner.nextInt();

        // Converting the days into months and years
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.printf("After converting the user input, the ans is: %d years, %d months, %d days", years, months, days);

    }
}
