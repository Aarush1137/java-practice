package day05_inheritance;

public class BankAccount {

    // Private fields (Encapsulation)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance. Balance set to 0.");
        }
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("=================================");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("=================================");
    }
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Aarush Jain", 10000);

        account.displayAccount();

        account.deposit(5000);

        account.withdraw(2000);

        account.withdraw(15000);

        account.deposit(-100);

        System.out.println("Current Balance: ₹" + account.getBalance());

        account.setAccountHolder("Rahul Sharma");

        account.displayAccount();
    }
}