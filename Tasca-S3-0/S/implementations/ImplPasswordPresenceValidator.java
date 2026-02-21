package main.java.implementations;

import main.java.interfaces.PasswordRegistration;
import main.java.user.User;

public class ImplPasswordPresenceValidator implements PasswordRegistration {
    public void registerPassword(User user){
        if (user.getPassword() == null) {
            throw new IllegalArgumentException("ERROR: The password was not recognized.");
        }
    }
}
