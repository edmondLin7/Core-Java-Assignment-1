package Day9;
class A extends Bank {
    private int balance;
    A (int balance) {
        this.balance = balance;
    }
    @Override
    public void getBalance() {
        System.out.println("Total Balance: " + balance);
    }
}

class B extends Bank {
    private int balance;
    B (int balance) {
        this.balance = balance;
    }
    @Override
    public void getBalance() {
        System.out.println("Total Balance: " + balance);
    }
}

class C extends Bank {
    private int balance;
    C (int balance) {
        this.balance = balance;
    }
    @Override
    public void getBalance() {
        System.out.println("Total Balance : " + balance);
    }
}
public class PrintBanks {
    public static void main(String[] args) {
        A bankA = new A(100);
        B bankB = new B(150);
        C bankC = new C(100);
        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();;
    }
}
