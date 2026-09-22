import java.util.Scanner;

class Wallet {
    double balance = 0;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: Rs." + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println("Balance: Rs." + balance);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wallet w = new Wallet();

        System.out.print("Enter deposit amount: ");
        w.deposit(sc.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        w.withdraw(sc.nextDouble());

        w.showBalance();

        sc.close();
    }
}