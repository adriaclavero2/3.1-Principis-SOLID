package main.java.validation;
import main.java.user.User;

public class PasswordValidator extends UserValidator {
    @Override
    public void validate(User user) {
        if (user.getPassword().length() < 8) throw new RuntimeException("Password muy corto");
        checkNext(user);
    }
}