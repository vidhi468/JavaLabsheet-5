// Q8: Bank Account — Encapsulation, this and Local Variable
class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(0, balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: Rs. " + amount);
        } else {
            System.out.println("Deposit failed: amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        boolean success = false; // Local variable tracks the outcome
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            success = true;
        }
        System.out.println(success ? "Withdrawal successful." : "Withdrawal failed.");
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Aarav Sharma", 5000.00);
        account.deposit(1500.00);
        account.withdraw(1200.00);
        account.displayAccount();
    }
}
