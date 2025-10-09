// Lab Session 4: Polymorphism and Abstract Classes

// Abstract class
abstract class Account {
    String accountHolder;
    double balance;

    // Constructor
    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method (must be overridden)
    abstract void calculateInterest();

    // Concrete method
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Derived class 1
class SavingsAccount extends Account {
    double interestRate = 0.05; // 5%

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("💰 Savings Account Interest: ₹" + interest);
    }
}

// Derived class 2
class CurrentAccount extends Account {
    double serviceCharge = 500; // flat service fee

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("⚠️ Current Account has no interest.");
        System.out.println("Service charge applied: ₹" + serviceCharge);
        balance -= serviceCharge;
    }
}

// Main class to demonstrate polymorphism
public class BankAccounts {
    public static void main(String[] args) {
        // Parent class reference → Child class objects
        Account acc1 = new SavingsAccount("Prerana", 50000);
        Account acc2 = new CurrentAccount("Ravi", 80000);

        System.out.println("---- Savings Account ----");
        acc1.displayBalance();
        acc1.calculateInterest();  // Calls SavingsAccount method

        System.out.println("\n---- Current Account ----");
        acc2.displayBalance();
        acc2.calculateInterest();  // Calls CurrentAccount method
        acc2.displayBalance();
    }
}
