import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        ArrayList<Integer> marksList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Marks Menu ---");
            System.out.println("1. Add Marks");
            System.out.println("2. View Marks");
            System.out.println("3. Update Marks");
            System.out.println("4. Delete Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter marks to add: ");
                    int mark = sc.nextInt();
                    marksList.add(mark);
                    System.out.println("Marks added successfully!");
                    break;

                case 2:
                    System.out.println("\nStudent Marks:");
                    Iterator<Integer> it = marksList.iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
                    break;

                case 3:
                    System.out.print("Enter index to update: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < marksList.size()) {
                        System.out.print("Enter new marks: ");
                        int newMark = sc.nextInt();
                        marksList.set(index, newMark);
                        System.out.println("Marks updated!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter index to delete: ");
                    int delIndex = sc.nextInt();
                    if (delIndex >= 0 && delIndex < marksList.size()) {
                        marksList.remove(delIndex);
                        System.out.println("Marks deleted!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}