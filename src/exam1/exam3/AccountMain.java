package exam1.exam3;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        account.print();


    }
}

//public class AccountMain {
//    public static void main(String[] args) {
//        AccountMain account = new AccountMain();
//        account.deposit(10000);
//        account.withdraw(9000);
//        account.withdraw(2000);
//
//        System.out.println("잔고" + account.balance);
//    }
//}