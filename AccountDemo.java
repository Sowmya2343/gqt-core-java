package Abstraction;

abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    void deposit(double am) { System.out.println("Savings: Deposited " + am); }
    void withdraw(double am) { System.out.println("Savings: Withdrew " + am); }
}

class CurrentAccount extends BankAccount {
    void deposit(double am) { System.out.println("Current: Deposited " + am); }
    void withdraw(double am) { System.out.println("Current: Withdrew " + am); }
}

public class AccountDemo {
    public static void main(String[] args) {
        BankAccount s = new SavingsAccount();
        BankAccount c = new CurrentAccount();
        s.deposit(1000); s.withdraw(500);
        c.deposit(2000); c.withdraw(100);
    }
}
