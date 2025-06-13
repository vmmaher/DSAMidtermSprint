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

public void completeTask(String description) {
    boolean result = tasks.markTaskCompleted(description);

    if (result) {
        System.out.println("Marked the task '" + description + "' as finished. Great work!");
    } else {
        System.out.println("The task named '" + description + "' wasn't found!");
    }
}

    public void viewTasks() {
        tasks.printTasks();
    }
}
