package todo;

public class Task {
    String description;
    boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false; // default to pending
    }
}
