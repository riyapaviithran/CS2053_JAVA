class Printer {
    
    public synchronized void printDocument(String user, int pages) {
        System.out.println(user + " started printing " + pages + " pages...");
        for (int i = 1; i <= pages; i++) {
            System.out.println(user + " printing page " + i);
            try {
                Thread.sleep(500); // simulate printing delay
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(user + " finished printing.\n");
    }
}


class User extends Thread {
    private Printer printer;
    private String userName;
    private int pages;

    public User(Printer printer, String userName, int pages) {
        this.printer = printer;
        this.userName = userName;
        this.pages = pages;
    }

    @Override
    public void run() {
        printer.printDocument(userName, pages);
    }
}


public class Lab7 {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        User u1 = new User(sharedPrinter, "Alice", 3);
        User u2 = new User(sharedPrinter, "Bob", 4);
        User u3 = new User(sharedPrinter, "Charlie", 2);

        u1.start();
        u2.start();
        u3.start();
    }
}