package come.gqt;



	class BankAccount {

	    private int accountNumber;
	    private double balance;

	    public BankAccount(int accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid amount!");
	        }
	    }
	}

	public class BankAcount3 {

	    public static void main(String[] args) {

	        BankAccount account = new BankAccount(12345, 1000.0);

	        System.out.println("Account Number: " + account.getAccountNumber());
	        System.out.println("Initial Balance: " + account.getBalance());

	        account.deposit(500);
	        account.withdraw(300);

	        System.out.println("Final Balance: " + account.getBalance());
	    }
	}