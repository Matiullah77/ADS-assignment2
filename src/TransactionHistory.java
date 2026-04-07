import java.util.Scanner;
import java.util.Stack;

public class TransactionHistory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> history = new Stack<>();

        history.push("Deposit 50000 to Ali");
        history.push("Withdraw 20000 from Ali");
        history.push("Bill payment Electricity");

        System.out.println(history.get(0));
        System.out.println(history.get(1));
        System.out.println(history.get(2));

        System.out.println("\nLast transaction: " + history.peek());

        history.pop();

        System.out.println("Undo → Last transaction removed");
    }
}