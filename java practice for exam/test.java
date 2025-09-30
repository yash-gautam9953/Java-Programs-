import java.util.Scanner;

class YASH_BANK {

    private String name;
    private double balance;
    private int pin;

    // Constructor
    YASH_BANK(String name, double balance, int pin) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    // Method to withdraw money
    int withdraw(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid amount entered!");
            return 0;
        }
        if (this.balance >= amt) {
            this.balance -= amt;
            System.out.println("Withdrawal successful! New balance: " + this.balance);
            return 1;
        } else {
            System.out.println("Insufficient balance!");
            return 0;
        }
    }

    // Method to deposit money
    int deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
            System.out.println("Deposit successful! New balance: " + this.balance);
            return 1;
        } else {
            System.out.println("Invalid deposit amount!");
            return 0;
        }
    }

    // Display user info (with correct PIN)
    void displayUserInfo(int enteredPin) {
        if (enteredPin == this.pin) {
            System.out.println("Name: " + this.name);
            System.out.println("Balance: " + this.balance);
        } else {
            System.out.println("Incorrect PIN! Access denied.");
        }
    }
}

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a bank account
        YASH_BANK user1 = new YASH_BANK("Yash Gautam", 100000, 202);

        int choice;
        do {
            System.out.println("-------------------------- WELCOME TO YASH BANK -------------------------");
            System.out.print("Choose 0, 1, 2, 3 for Exit, Withdraw, Deposit, Check Information respectively: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double wAmt = sc.nextDouble();
                    user1.withdraw(wAmt);
                    break;

                case 2: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double dAmt = sc.nextDouble();
                    user1.deposit(dAmt);
                    break;

                case 3: // Check Information
                    System.out.print("Enter PIN: ");
                    int enteredPin = sc.nextInt();
                    user1.displayUserInfo(enteredPin);
                    break;

                case 0: // Exit
                    System.out.println("Thank you for banking with YASH BANK!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}
