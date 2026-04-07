public class BankAccount {

    int accountNumber;
    String username;
    double balance;
    BankAccount next;

    public BankAccount(int accountNumber, String username, double balance) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.balance = balance;
        this.next = null;
    }
}