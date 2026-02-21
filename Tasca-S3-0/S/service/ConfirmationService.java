package main.java.service;
import main.java.user.User;

public class ConfirmationService {
    public boolean isConfirmed(User user) {
        System.out.println("Waiting user's confirmation " + user.getName() + "...");
        return true;
    }
}