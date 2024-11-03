//Digital ATM of mine

import java.util.Scanner;
public class myatm {
    private double balance;

    public myatm(double startingB) {
        this.balance = startingB;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposit successful. Your new balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkB() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        myatm atm = new myatm(0.0);

        while (true) {
            System.out.println("My ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    atm.checkB();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositA = scanner.nextDouble();
                    atm.deposit(depositA);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawA = scanner.nextDouble();
                    atm.withdraw(withdrawA);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
