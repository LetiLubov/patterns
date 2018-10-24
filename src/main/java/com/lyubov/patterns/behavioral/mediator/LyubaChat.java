package com.lyubov.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete mediator
 */
public class LyubaChat implements Chat {
    private List<Client> users = new ArrayList();
    private Client admin;
    public void setAdmin(Client admin) {
        this.admin = admin;
    }

    public void sendMessage(String message, Client client) {
        for (Client user : users) {
            user.getMessage("(" + client.getNickName() + "): " + message);
        }

        admin.getMessage( "(" + client.getNickName() + "): " + message);
    }
    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
}
