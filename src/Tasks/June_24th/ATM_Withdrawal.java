package Tasks.June_24th;

import java.util.Scanner;

public class ATM_Withdrawal {
    // Account Balance
   static int accountBalance = 10_000;

    public static void main(String[] args) {
        // Taking the amount of money user wants to withdraw from Bank
        System.out.println("Please enter the amount you want to withdraw.");
        Scanner scanner = new Scanner(System.in);
        int withdrawalAmount = scanner.nextInt();


        // Checking if the amount user enter is valid or not
        if (withdrawalAmount < 0) {
            System.out.println("The amount you enter is invalid.\nPlease enter the amount higher than zero");
        } else if (withdrawalAmount % 100 != 0) {
            System.out.println("The amount entered should be a multiple of 100.\nPlease choose the numbers which are multiple of 100");
        } else if (withdrawalAmount > accountBalance) {
            System.out.printf("The amount %d you entered is greater than your acc balance %d.\nPlease enter amount less than %d", withdrawalAmount, accountBalance, accountBalance);
        } else {
            accountBalance -= withdrawalAmount;

            System.out.printf("The amount %d is deducted from your bank account.\nThe new account balance is: %d",withdrawalAmount, accountBalance );
        }
    }
}
