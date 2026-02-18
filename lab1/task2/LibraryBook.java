package lab1.task2;

public class LibraryBook {
    
    // Usage: Enum [cite: 32]
    public enum BookType {
        PAPERBACK, HARDCOVER, EBOOK
    }

    // Usage: Static & Final modifiers [cite: 32]
    private static int totalBooks = 0; 
    public static final String LIBRARY_NAME = "KBTU Library";
    
    // Usage: Static non-final field [cite: 34]
    public static String currentSeason = "Spring 2026";

    // Usage: Read-only field (no setter) [cite: 32]
    private final int bookId;
    
    private String title;
    private BookType type;

    // Usage: Initialization block [cite: 32]
    {
        totalBooks++;
        bookId = totalBooks + 100; // Генерация ID
    }

    // Usage: Constructors & 'this' keyword [cite: 32]
    public LibraryBook(String title, BookType type) {
        this.title = title; // 'this' для поля экземпляра
        this.type = type;
    }

    // Usage: Method Overloading & 'this' for constructor call [cite: 32]
    public LibraryBook(String title) {
        this(title, BookType.PAPERBACK);
    }

    public int getBookId() {
        return bookId; // Read-only access
    }

    // Usage: Method Overloading
    public void read() {
        System.out.println("Reading " + title);
    }

    public void read(int minutes) {
        System.out.println("Reading " + title + " for " + minutes + " minutes.");
    }
    
    public static int getTotalBooks() {
        return totalBooks;
    }
}