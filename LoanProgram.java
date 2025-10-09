// Lab Session 5: Packages and Interfaces
// Combined single-file version for easy compilation and execution

// Interface definition
interface Loan {
    double calculateInterest(double principal, double rate, int time);
    void displayLoanDetails();
}

// HomeLoan class implementing Loan interface
class HomeLoan implements Loan {
    private double principal;
    private double rate;
    private int time;

    public HomeLoan(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    @Override
    public double calculateInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    @Override
    public void displayLoanDetails() {
        System.out.println("🏠 Home Loan Details:");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Interest: " + calculateInterest(principal, rate, time));
        System.out.println();
    }
}

// CarLoan class implementing Loan interface
class CarLoan implements Loan {
    private double principal;
    private double rate;
    private int time;

    public CarLoan(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    @Override
    public double calculateInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    @Override
    public void displayLoanDetails() {
        System.out.println("🚗 Car Loan Details:");
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Interest: " + calculateInterest(principal, rate, time));
        System.out.println();
    }
}

// Main class
public class LoanProgram {
    public static void main(String[] args) {
        Loan home = new HomeLoan(500000, 6.5, 10);
        Loan car = new CarLoan(300000, 8.0, 5);

        home.displayLoanDetails();
        car.displayLoanDetails();
    }
}
