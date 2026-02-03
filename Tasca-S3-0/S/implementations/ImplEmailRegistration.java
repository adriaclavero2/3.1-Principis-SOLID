package implementations;

import interfaces.EmailRegistration;
import user.User;

public class ImplEmailRegistration implements EmailRegistration {
    public void registerEmail(User user) {
        if (user.getEmail() == null || !user.getEmail().contains("@") ||
                !user.getEmail().contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        System.out.println("Sending confirmation email to: " + user.getEmail());
    }
}
