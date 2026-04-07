public class ArrayAccounts {

    public static void main(String[] args) {

        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new BankAccount(1,"Ali",150000);
        accounts[1] = new BankAccount(2,"Sara",220000);
        accounts[2] = new BankAccount(3,"Omar",170000);

        for(BankAccount a : accounts){
            System.out.println(a.accountNumber+" "+a.username+" "+a.balance);
        }
    }
}