package ru.mirea.practices0000001.task3;

public class ServiceUser {
    private String service;
    private String username;
    private String password;

    ServiceUser(String service, String username, String password) {
        this.service = service;
        this.username = username;
        this.password = password;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
