package main.java.implementations;
import main.java.user.User;
import main.java.interfaces.EmailRegistration;

public class ImplEmailRegistration implements EmailRegistration {
    public void registerEmail(User user) {
        if (user.getEmail() == null || !user.getEmail().contains("@") ||
                !user.getEmail().contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        System.out.println("Sending confirmation email to: " + user.getEmail());
    }
}
