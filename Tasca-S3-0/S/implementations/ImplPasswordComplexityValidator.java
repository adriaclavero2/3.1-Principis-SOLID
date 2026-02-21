package main.java.implementations;

import main.java.interfaces.PasswordRegistration;
import main.java.user.User;

public class ImplPasswordComplexityValidator implements PasswordRegistration {
    public void registerPassword(User user) {
       if(!user.getPassword().matches(".*[A-Z].*")){
           throw new IllegalArgumentException("ERROR: The password is very weak.");
        }
    }
}
