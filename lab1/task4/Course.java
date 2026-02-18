package lab1.task4;

public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisite;

    // [cite: 57]
    public Course(String name, String description, int credits, String prerequisite) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name + " (" + description + ")";
    }
}
