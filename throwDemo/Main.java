package throwDemo;

public class Main {
    public static void main(String[] args) {

        AccountManager manager = new AccountManager();
        System.out.println("Balance" + manager.getBalance());
        manager.deposit(100);
        System.out.println("Balance" + manager.getBalance());
        try {
            manager.withdraw(90);
        } catch (Exception err) {
            System.out.println("Error: " + err.getMessage());
        }
        System.out.println("Balance" + manager.getBalance());
        try {
            manager.withdraw(90);
        } catch (Exception err) {
            System.out.println("Error: " + err.getMessage());
        }
        System.out.println("Balance" + manager.getBalance());
    }
}
