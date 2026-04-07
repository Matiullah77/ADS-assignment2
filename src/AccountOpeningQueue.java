import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AccountOpeningQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<String> accountRequests = new LinkedList<>();
        LinkedList<BankAccount> accounts = new LinkedList<>();

        System.out.print("Enter username for account request: ");
        String user = sc.next();

        accountRequests.add(user);

        System.out.println("Pending Requests: "+accountRequests);

        String approved = accountRequests.poll();

        accounts.add(new BankAccount(accounts.size()+1,approved,0));

        System.out.println("Processed account for: "+approved);
    }
}