import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BillPaymentQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> billQueue = new LinkedList<>();

        System.out.print("Enter first bill: ");
        String b1 = sc.nextLine();

        System.out.print("Enter second bill: ");
        String b2 = sc.nextLine();

        billQueue.add(b1);
        billQueue.add(b2);

        System.out.println("Added: " + b1);
        System.out.println("Added: " + b2);

        System.out.println("Processing: " + billQueue.poll());

        System.out.println("Remaining: " + billQueue.peek());
    }
}