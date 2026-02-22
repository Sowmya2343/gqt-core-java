package Inheritance;

class BankAccount {
    int accNo;
    double balance;

    BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    void display() {
        System.out.println("Savings Account: " + accNo + " " + balance);
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }

    void display() {
        System.out.println("Current Account: " + accNo + " " + balance);
    }
}

public class Main6 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(1234, 5000);
        s.display();
    }
}
