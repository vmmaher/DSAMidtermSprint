package todo;

import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public boolean addUser(String name) {
        if (findUser(name) != null) {
            System.out.println("A user with the name '" + name + "' already exists.");
            return false;
        }

        users.add(new User(name));
        return true;
    }

    public User findUser(String name) {
        for (User user : users) {
                if (user.name.equals(name)) {
                    return user;
                }
            }
            return null;
        }


    public void printAllUsers() {
        if (users.isEmpty()) {
            System.out.println("There are no users registered.");
            return;
        }

        for (User user : users) {
            System.out.println("- " + user.name);
        }
    }
}