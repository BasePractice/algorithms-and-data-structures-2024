package ru.mirea.practice.s23k0120.task1;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<Client> clients;

    Database(List<Client> clients) {
        this.clients = clients;
    }

    Database() {
        this.clients = new ArrayList<Client>();
    }

    public Client getClient(String inn) {
        for (Client client : clients) {
            if (client.getInn().equals(inn)) {
                return client;
            }
        }
        return null;
    }

    public void addClient(String name, String inn) {
        clients.add(new Client(name, inn));
    }
}
