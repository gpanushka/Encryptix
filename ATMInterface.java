package ATMatm;
public class ATMInterface {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.00); // Replace with initial balance
        ATM atm = new ATM(account);
        atm.performTransaction();
    }
}




class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
