package ru.mirea.practice.s23k0164.t3;

public class UserService {

    private Users[] usersArray;

    public UserService() {
        usersArray = new Users[2];
        usersArray[0] = new Users("admin", "admin123");
        usersArray[1] = new Users("user", "user123");
    }

    public boolean authenticate(String login, String password) {
        for (Users user : usersArray) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

