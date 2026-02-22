package Abstraction;

abstract class Bank {
    abstract void openAccount();
    abstract void closeAccount();
}

class SavingsBank extends Bank {
    void openAccount() { System.out.println("Opening Savings Bank Account."); }
    void closeAccount() { System.out.println("Closing Savings Bank Account."); }
}

class CurrentBank extends Bank {
    void openAccount() { System.out.println("Opening Current Bank Account."); }
    void closeAccount() { System.out.println("Closing Current Bank Account."); }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank sb = new SavingsBank();
        Bank cb = new CurrentBank();
        sb.openAccount(); sb.closeAccount();
        cb.openAccount(); cb.closeAccount();
    }
}
