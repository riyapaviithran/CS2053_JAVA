class Account {
    String accountNumber;

    // Constructor for Account
    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        System.out.println("Account Constructor Called: Account Number = " + accountNumber);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    // Constructor for SavingsAccount
    SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber); // Call parent (Account) constructor
        this.interestRate = interestRate;
        System.out.println("SavingsAccount Constructor Called: Interest Rate = " + interestRate + "%");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        System.out.println("Creating Savings Account...");
        SavingsAccount sa = new SavingsAccount("ACC12345", 5.5);
    }
}
