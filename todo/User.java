package todo;

public class User {
    String name;
    TaskList tasks;

    public User(String name) {
        this.name = name;
        this.tasks = new TaskList(); // empty list
    }

    public void addTask(String description) {
    tasks.addTask(description);
}

    public void viewTasks() {
        tasks.printTasks();
    }
}
