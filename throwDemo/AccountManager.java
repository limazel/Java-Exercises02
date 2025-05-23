package throwDemo;

public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws BalanceInsufficientException {
        if(balance >= amount) {
            balance -= amount;
        } else {
            throw new BalanceInsufficientException("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}
