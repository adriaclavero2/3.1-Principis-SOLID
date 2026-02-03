package implementations;

import interfaces.PasswordRegistration;
import user.User;

public class ImplPasswordRegistration implements PasswordRegistration {
    public void registerPassword(User user){
        if (user.getPassword() == null || user.getPassword().length() < 8 ||
                !user.getPassword().matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter.");
        }
    }
}
