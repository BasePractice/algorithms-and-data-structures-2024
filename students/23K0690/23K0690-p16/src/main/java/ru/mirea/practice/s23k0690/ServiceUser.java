package ru.mirea.practice.s23k0690;

public class ServiceUser {
    private String serviceName;
    private String user;
    private String pass;

    ServiceUser(String serviceName, String user, String pass) {
        this.serviceName = serviceName;
        this.user = user;
        this.pass = pass;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}
