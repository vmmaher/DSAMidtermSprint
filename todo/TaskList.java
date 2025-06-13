package todo;

public class TaskList {
    private Node head;

    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        Node newNode = new Node(newTask);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean markTaskCompleted(String description) {
    Node current = head;

    while (current != null) {
        if (current.task.description.equals(description)) {
            current.task.completed = true;
            return true;
        }
        current = current.next;
    }

    return false;
}
    public void printTasks() {
    Node current = head;
    if (current == null) {
        System.out.println("No tasks were found.");
        return;
    }

        boolean hasPending = false;
        System.out.println("Pending Tasks:");
        Node temp = head;
        while (temp != null) {
            if (!temp.task.completed) {
                System.out.println("- " + temp.task.description + " [Pending]");
                hasPending = true;
            }
            temp = temp.next;
        }
        if (!hasPending) {
        System.out.println("There are no pending tasks. Great job!\n");
    }

    boolean hasCompleted = false;
        System.out.println("Completed Tasks:");
        temp = head;
        while (temp != null) {
            if (temp.task.completed) {
                System.out.println("- " + temp.task.description + " [Completed]");
                hasCompleted = true;
            }
            temp = temp.next;
        }
        if (!hasCompleted) {
            System.out.println("There are no completed tasks yet. Keep going!\n");
        }
    }
}
