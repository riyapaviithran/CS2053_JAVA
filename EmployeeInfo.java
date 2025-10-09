
import java.util.Scanner;

public class EmployeeInfo {
    String name;
    String department;
    double salary;

    // Constructor
    EmployeeInfo(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    void displayInfo() {
        System.out.println("\n👤 Employee Information");
        System.out.println("---------------------------");
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary     : ₹" + salary);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Accept data using Scanner
        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Department:");
        String dept = sc.nextLine();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        // Create an object
        EmployeeInfo emp = new EmployeeInfo(name, dept, salary);
        emp.displayInfo();

        // Step 2: Process command-line arguments (for batch salary update)
        if (args.length > 0) {
            try {
                double increment = Double.parseDouble(args[0]);
                System.out.println("\n💰 Applying salary increment of ₹" + increment);
                double newSalary = salary + increment;
                System.out.println("Updated Salary: ₹" + newSalary);
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Invalid argument. Please enter a numeric increment value.");
            }
        } else {
            System.out.println("\nNo command-line arguments provided for salary update.");
        }

        sc.close();
    }
}
