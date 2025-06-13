package todo;

public class Main {
    public static void main(String[] args) {
        User user = new User("Person A");
        System.out.println("Created user -> " + user.name);
        System.out.println("The user's task list has been initialized");
    }
}
