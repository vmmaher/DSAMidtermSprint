package todo;

public class Main {
    public static void main(String[] args) {
        User user = new User("Person A");
        System.out.println("Created user -> " + user.name);
        System.out.println(user.name + "'s task list has been initialized");

        user.addTask("Go grocery shopping");
        user.addTask("Help Joey with homework");
        user.addTask("Work meeting");

        System.out.println("Current tasks for " + user.name + ":");
        user.viewTasks();
    }
}
