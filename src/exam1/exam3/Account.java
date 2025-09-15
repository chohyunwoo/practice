package exam1.exam3;

public class Account {
    private int balance; //잔고


    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {

        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액 부족");
        }
    }

    public void print(){
         System.out.println("잔고" + balance);
    }
}