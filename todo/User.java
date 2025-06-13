package todo;

public class User {
    String name;
    TaskList tasks; // empty for now

    // Constructor
    public User(String name) {
        this.name = name;
        this.tasks = new TaskList(); // empty list initially
    }
}
