import java.util.Scanner;
public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000; // initial balance
        int pin = 1234; // fixed PIN
        int enteredPin;

        System.out.print("Enter your PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            System.out.println("Login successful!\n");

            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: " + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: ");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Deposit successful! New balance: " + balance);
            } else if (choice == 3) {
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Withdraw successful! Remaining balance: " + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
            } else if (choice == 4) {
                System.out.println("Thank you for using ATM!");
            } else {
                System.out.println("Invalid option.");
            }

        } else {
            System.out.println("Incorrect PIN. Access denied!");
        }

        sc.close();
    }
}
