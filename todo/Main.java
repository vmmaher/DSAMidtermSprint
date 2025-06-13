package todo;

public class Main {
    public static void main(String[] args) {
    UserManager userManager = new UserManager();
        
        userManager.addUser("Person A");
        userManager.addUser("Person B");
        userManager.addUser("Person A"); // should not work, already exists

        User userA = userManager.findUser("Person A");
        if (userA != null) {
            userA.addTask("Go grocery shopping");
            userA.addTask("Help Joey with homework");
        }

        User userB = userManager.findUser("Person B");
        if (userB != null) {
            userB.addTask("Walk the dog");
            userB.addTask("Work meeting");
            userB.addTask("Buy dog food");
        }

        System.out.println("\nInitial Tasks for Person A:");
        userA.viewTasks();
        System.out.println("\nInitial Tasks for Person B:");
        userB.viewTasks();
        
        userA.completeTask("Go grocery shopping");
        userA.completeTask("Help Joey with homework");
        userB.completeTask("Walk the dog");
        userB.completeTask("Go to the gym"); // should not work, task not found

        System.out.println("\n--- Users and Their Tasks ---");
        userManager.printAllUsers();
        System.out.println("\nCurrent Tasks for Person A:");
        userA.viewTasks();
        System.out.println("\nCurrent Tasks for Person B:");
        userB.viewTasks();

    }
}
