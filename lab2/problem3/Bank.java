package lab2.problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Opened: " + account.toString());
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Closed: Account #" + account.getAccountNumber());
    }

    public void update() {
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void printAllAccounts() {
        for (Account acc : accounts) {
            acc.print();
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Bank myBank = new Bank();

        Account regular = new Account(1001);
        SavingsAccount savings = new SavingsAccount(2001, 5.0);
        CheckingAccount checking = new CheckingAccount(3001);

        myBank.openAccount(regular);
        myBank.openAccount(savings);
        myBank.openAccount(checking);

        System.out.println("\n--- Initial Operations ---");
        regular.deposit(100.0);
        savings.deposit(500.0);
        
        checking.deposit(200.0);
        checking.withdraw(10.0);
        checking.withdraw(20.0);
        checking.withdraw(30.0); 

        myBank.printAllAccounts();

        System.out.println("--- Calling update() ---");
        myBank.update();
        myBank.printAllAccounts();
        
        System.out.println("--- Closing account ---");
        myBank.closeAccount(regular);
    }
}