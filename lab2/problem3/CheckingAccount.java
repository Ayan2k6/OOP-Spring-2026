package lab2.problem3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double FEE = 0.02;

    public CheckingAccount(int a) {
        super(a);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            double fees = (transactionCount - FREE_TRANSACTIONS) * FEE;
            super.withdraw(fees);
        }
        transactionCount = 0;
    }

    @Override
    public String toString() {
        return "Checking " + super.toString() + ", Transactions: " + transactionCount;
    }
}