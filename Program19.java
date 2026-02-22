package Abstraction;

abstract class BankAccount {
    double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Savings: Deposited " + amount + ". New Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Savings: Withdrew " + amount + ". Remaining: " + balance);
        } else {
            System.out.println("Savings: Insufficient funds.");
        }
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Current: Deposited " + amount + ". New Balance: " + balance);
    }

    @Override
    void withdraw(double amount) {
        // Current accounts often allow overdrafts, but we'll keep it simple
        balance -= amount;
        System.out.println("Current: Withdrew " + amount + ". New Balance: " + balance);
    }
}

// Demo for Program 19
public class Program19 {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount();
        BankAccount ca = new CurrentAccount();

        sa.deposit(500);
        sa.withdraw(200);

        ca.deposit(1000);
        ca.withdraw(1200);
    }
}