
class NegativeBalanceException extends Exception {

    public NegativeBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws NegativeBalanceException {
        if (balance - amount < 0) {
            throw new NegativeBalanceException("Insufficient funds to withdraw " + amount);
        } else {
            balance -= amount;
        }
    }
}

public class UserDefinedException {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        try {
            account.withdraw(200);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining balance: " + account.getBalance());
    }
}
