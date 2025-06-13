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

    public void printTasks() {
        Node current = head;
        if (current == null) {
            System.out.println("No tasks were found.");
            return;
        }

        while (current != null) {
            System.out.println("- " + current.task.description + " [" + (current.task.completed ? "Completed" : "Pending") + "]");
            current = current.next;
        }
    }
}
