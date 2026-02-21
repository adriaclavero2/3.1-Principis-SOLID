package main.java.implementations;

import main.java.interfaces.PasswordRegistration;
import main.java.user.User;

public class ImplPasswordLengthValidator implements PasswordRegistration {
    public void registerPassword(User user) {
        if (user.getPassword().length() < 8) {
            throw new IllegalArgumentException("The password has fewer than eight characters.");
        }
    }
}
