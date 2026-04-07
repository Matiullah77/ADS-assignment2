import java.util.*;

public class MiniBankingMenu {

    static BankAccount head = null; // LinkedList for accounts
    static Stack<String> history = new Stack<>(); // Transaction history
    static Queue<String> billQueue = new LinkedList<>(); // Bill payment queue
    static Queue<String> accountRequests = new LinkedList<>(); // Account request queue

    // Recursively add account to LinkedList
    static BankAccount addAccount(BankAccount node, String username, double balance) {
        if (node == null) return new BankAccount((head==null?1:countAccounts(head)+1), username, balance);
        node.next = addAccount(node.next, username, balance);
        return node;
    }

    // Count accounts in LinkedList
    static int countAccounts(BankAccount node) {
        if (node == null) return 0;
        return 1 + countAccounts(node.next);
    }

    // Recursively search account by username
    static BankAccount searchAccount(BankAccount node, String username) {
        if (node == null) return null;
        if (node.username.equals(username)) return node;
        return searchAccount(node.next, username);
    }

    // Recursively display all accounts
    static void displayAccounts(BankAccount node, int index) {
        if (node == null) return;
        System.out.println(index + ". " + node.username + " – Balance: " + node.balance);
        displayAccounts(node.next, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Mini Banking Menu ---");
            System.out.println("1 – Enter Bank");
            System.out.println("2 – Enter ATM");
            System.out.println("3 – Admin Area");
            System.out.println("4 – Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) { // Bank Menu
                System.out.println("\nBank Menu:");
                System.out.println("1 – Submit account opening request");
                System.out.println("2 – Deposit money");
                System.out.println("3 – Withdraw money");
                System.out.print("Choose option: ");
                int c = sc.nextInt();
                sc.nextLine();

                if (c == 1) {
                    System.out.print("Enter username for account request: ");
                    String user = sc.nextLine();
                    accountRequests.add(user);
                    System.out.println("Account request submitted successfully.");
                } else if (c == 2) {
                    System.out.print("Enter username: ");
                    String user = sc.nextLine();
                    BankAccount acc = searchAccount(head, user);
                    if (acc != null) {
                        System.out.print("Enter deposit amount: ");
                        double amount = sc.nextDouble();
                        acc.balance += amount;
                        history.push("Deposit " + amount + " to " + user);
                        System.out.println("Deposit successful. New balance: " + acc.balance);
                    } else {
                        System.out.println("Account not found.");
                    }
                } else if (c == 3) {
                    System.out.print("Enter username: ");
                    String user = sc.nextLine();
                    BankAccount acc = searchAccount(head, user);
                    if (acc != null) {
                        System.out.print("Enter withdraw amount: ");
                        double amount = sc.nextDouble();
                        acc.balance -= amount;
                        history.push("Withdraw " + amount + " from " + user);
                        System.out.println("Withdraw successful. New balance: " + acc.balance);
                    } else {
                        System.out.println("Account not found.");
                    }
                }
            } else if (choice == 2) { // ATM Menu
                System.out.print("Enter username: ");
                sc.nextLine();
                String user = sc.nextLine();
                BankAccount acc = searchAccount(head, user);
                if (acc != null) {
                    System.out.println("Balance: " + acc.balance);
                    System.out.print("Enter withdraw amount: ");
                    double amount = sc.nextDouble();
                    acc.balance -= amount;
                    history.push("Withdraw " + amount + " from " + user);
                    System.out.println("Withdraw successful. New balance: " + acc.balance);
                } else {
                    System.out.println("Account not found.");
                }
            } else if (choice == 3) { // Admin Menu
                System.out.println("\nAdmin Area:");
                System.out.println("1 – View pending account requests");
                System.out.println("2 – Process next account request");
                System.out.println("3 – View bill payment queue");
                System.out.print("Choose option: ");
                int a = sc.nextInt();
                sc.nextLine();

                if (a == 1) {
                    System.out.println("Pending Requests: " + accountRequests);
                } else if (a == 2) {
                    if (!accountRequests.isEmpty()) {
                        String user = accountRequests.poll();
                        head = addAccount(head, user, 0);
                        System.out.println("Processed account for: " + user);
                        System.out.println("Current Accounts List:");
                        displayAccounts(head, 1);
                    } else {
                        System.out.println("No pending requests.");
                    }
                } else if (a == 3) {
                    System.out.println("Bill Payment Queue: " + billQueue);
                }
            } else if (choice == 4) { // Exit
                System.out.println("Exiting Mini Banking Menu. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}