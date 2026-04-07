import java.util.Scanner;

public class DepositWithdraw {

    static BankAccount head = null;

    static BankAccount add(BankAccount node,int acc,String user,double bal){
        if(node==null)
            return new BankAccount(acc,user,bal);

        node.next = add(node.next,acc,user,bal);
        return node;
    }

    static BankAccount search(BankAccount node,String username){
        if(node==null) return null;

        if(node.username.equals(username))
            return node;

        return search(node.next,username);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        head = add(head,1,"Ali",150000);
        head = add(head,2,"Sara",220000);

        System.out.print("Enter username: ");
        String u = sc.next();

        BankAccount acc = search(head,u);

        if(acc!=null){

            System.out.print("Deposit: ");
            double d = sc.nextDouble();

            acc.balance += d;

            System.out.println("New balance: "+acc.balance);

            System.out.print("Withdraw: ");
            double w = sc.nextDouble();

            acc.balance -= w;

            System.out.println("New balance: "+acc.balance);
        }
        else
            System.out.println("Account not found");
    }
}