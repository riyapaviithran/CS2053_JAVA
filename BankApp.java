// File: BankApp.java
// Lab Session 6: Exception Handling (Built-in + Custom)

import java.util.Scanner;

// Custom Exception Class
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Withdraw method with custom exception
    public void withdraw(double amount) throws LowBalanceException {
        System.out.println("\nAttempting to withdraw ₹" + amount + "...");
        if (amount > balance) {
            throw new LowBalanceException("❌ Insufficient balance! Current balance: ₹" + balance);
        } else if (balance - amount < 500) {
            throw new LowBalanceException("⚠️ Minimum balance of ₹500 must be maintained!");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawal successful! Remaining balance: ₹" + balance);
        }
    }

    // Getter
    public double getBalance() {
        return balance;
    }
}

// Main class
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("Prerana", 2000);

        try {
            System.out.println("Welcome, " + "Prerana" + "!");
            System.out.println("Your current balance is: ₹" + account.getBalance());

            System.out.print("Enter amount to withdraw: ₹");
            double amount = sc.nextDouble();

            account.withdraw(amount);  // May throw custom exception

        } catch (LowBalanceException e) {
            System.out.println(e.getMessage()); // Display custom error message
        } catch (Exception e) {
            System.out.println("❗ Unexpected error: " + e);
        } finally {
            System.out.println("🧾 Transaction complete. Thank you for using our bank.");
        }

        sc.close();
    }
}
