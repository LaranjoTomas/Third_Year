package lab09.ex1_b;

public class Proxy implements BankAccount{

    BankAccount bank_acc;

    public Proxy(BankAccount bank_acc) {
        this.bank_acc = bank_acc;
    }

    @Override
    public void deposit(double amount) {
        bank_acc.deposit(amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (Company.user == User.OWNER) {
            return bank_acc.withdraw(amount);
        } else {
            return false; 
        }

    }

    @Override
    public double balance() {
        if (Company.user == User.OWNER) {
            return bank_acc.balance();
        } else {
            return 0;
        }
    }

}