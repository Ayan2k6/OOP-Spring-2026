package pr5.io.model; // problem3

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L; 
    
    private String title;
    private String author;
    
    private transient int visitCount;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.visitCount = 0;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getVisitCount() { return visitCount; }
    
    public void incrementVisitCount() { 
        visitCount++; 
    }

    @Override
    public String toString() {
        return "Книга: '" + title + "', Автор: '" + author + "' | Просмотров в текущей сессии: " + visitCount;
    }
}
