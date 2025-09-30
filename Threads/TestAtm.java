import java.util.Scanner;

class Atm {
    int balance = 5000;

   
    void withdraw(double amount, String user) {
        if (balance >= amount) {
            System.out.println("Waiting for Trasaction "+ amount);
            balance -= amount;
            System.out.println(" Transaction is completed. Balance left: " + balance);
        } else {
            System.out.println(user + " - Not enough balance!");
        }
    }
}

class MyThread extends Thread {
    Atm account;
    String user;
    double amount;

    MyThread(Atm account, String user, double amount) {
        this.account = account;
        this.user = user;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount, user);
    }
}

public class TestAtm {
    public static void main(String[] args) {

        Atm sharedAccount = new Atm();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amt : ");
        double amt = sc.nextDouble();
        MyThread t1 = new MyThread(sharedAccount, "Yash Gautam", amt);
        System.out.print("Enter Amt2 : ");
        double amt2 = sc.nextDouble();
        MyThread t2 = new MyThread(sharedAccount, "Harsh Gautam", amt2);

        t1.start();
        t2.start();
        
    }
}