
public class BankAcct {

    // Balance and Rate of interest.
    private double bal;
    private double rate;

    // Calculating interest and updated balance.
    private class Interest {

        private double rate;

        public Interest(double rate) {
            this.rate = rate;
        }

        void calInterest() {
            double interest = bal * rate / 100;
            System.out.println("Interest: " + interest);
            System.out.println("Balance amount = " + (bal + interest));
        }
    }

    // Authentication method to access inner class
    boolean authenticate(String password) {
        if (password.equals("bankperson")) { // replace with actual authentication logic
            return true;
        } else {
            return false;
        }
    }

    // Constructor for BankAcct class
    public BankAcct(double rate, double bal) {
        this.rate = rate;
        this.bal = bal;
    }

    // Contact method to access inner class
    public void contact() {
        Interest interest = new Interest(rate);
        if (authenticate("bankperson")) {
            System.out.println("Access granted. Interest calculation and updated balance:");
            interest.calInterest();
        } else {
            System.out.println("Unauthorized access denied.");
        }
    }

    // Getters for rate and balance
    public double getRate() {
        return this.rate;
    }

    public double getBalance() {
        return this.bal;
    }

    // Main method to test the BankAcct class
    public static void main(String[] args) {
        BankAcct ba = new BankAcct(11.5, 1000);
        System.out.println("Rate: " + ba.getRate());
        System.out.println("Balance: " + ba.getBalance());
        ba.contact(); // Only authorized person can update the balance
    }
}
