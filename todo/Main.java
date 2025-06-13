package todo;

public class Main {
    public static void main(String[] args) {
        User user = new User("Person A");
        System.out.println("Created user -> " + user.name);
        System.out.println(user.name + "'s task list has been initialized");
        System.out.println("");

        user.addTask("Go grocery shopping");
        user.addTask("Help Joey with homework");
        user.addTask("Work meeting");

        System.out.println("Current tasks for " + user.name + ":");
        user.viewTasks();
        System.out.println("");

        user.completeTask("Help Joey with homework");
        System.out.println("");
        
        System.out.println("Updated task list for " + user.name + ":");
        user.viewTasks();
    }
}
