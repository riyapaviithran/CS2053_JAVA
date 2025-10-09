
class Book {
    // Instance variables
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        // Using 'this' keyword to distinguish instance variables from parameters
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("📖 Book Details:");
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price  : ₹" + this.price);
        System.out.println("---------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Creating book objects using constructors
        Book b1 = new Book();
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 499.99);

        // Displaying book details
        b1.displayDetails();
        b2.displayDetails();
    }
}
