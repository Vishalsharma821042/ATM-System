import java.util.Scanner;

public class ATMTransaction {
    public static void main(String[] args) {
        int atmBalance = 10000; // Initial ATM balance
        int userBalance = 5000; // Initial user account balance
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Withdraw
                    System.out.print("Enter amount to be withdrawn: ");
                    int withdrawAmount = scanner.nextInt();
                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount.");
                    } else if (withdrawAmount > userBalance) {
                        System.out.println("Insufficient funds in your account.");
                    } else if (withdrawAmount > atmBalance) {
                        System.out.println("Insufficient funds in ATM.");
                    } else {
                        userBalance -= withdrawAmount;
                        atmBalance -= withdrawAmount;
                        System.out.println("Please collect your money.");
                        // Display remaining user balance
                        System.out.println("Your remaining balance is: " + userBalance);
                    }
                    break;

                case 2: // Deposit
                    System.out.print("Enter amount to be deposited: ");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount.");
                    } else if (depositAmount > 50000) {
                        System.out.println("Exceeds maximum deposit limit of 50,000.");
                    } else {
                        userBalance += depositAmount;
                        atmBalance += depositAmount;
                        System.out.println("Your money has been successfully deposited.");
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("User Balance: " + userBalance);
                    System.out.println("ATM Balance: " + atmBalance);
                    break;

                case 4: // Exit
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}