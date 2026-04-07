import java.util.Scanner;

public class LinkedListAccounts {

    static BankAccount head = null;

    static BankAccount addAccount(BankAccount node, int acc, String user, double bal) {
        if (node == null) {
            System.out.println("Account added successfully");
            return new BankAccount(acc, user, bal);
        }
        node.next = addAccount(node.next, acc, user, bal);
        return node;
    }

    static void displayAccounts(BankAccount node, int index) {
        if (node == null) return;
        System.out.println(index + ". " + node.username + " – Balance: " + node.balance);
        displayAccounts(node.next, index + 1);
    }

    static BankAccount searchAccount(BankAccount node, String username) {
        if (node == null) return null;
        if (node.username.equals(username)) return node;
        return searchAccount(node.next, username);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        head = addAccount(head,1,"Ali",150000);
        head = addAccount(head,2,"Sara",220000);

        System.out.println("\nAccounts List:");
        displayAccounts(head,1);

        System.out.print("\nSearch account by username: ");
        String u = sc.next();

        BankAccount acc = searchAccount(head,u);

        if(acc!=null)
            System.out.println("Found: "+acc.username+" Balance: "+acc.balance);
        else
            System.out.println("Account not found");
    }
}