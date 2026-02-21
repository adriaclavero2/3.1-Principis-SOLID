package main.java.validation;
import main.java.user.User;

public class EmailValidator extends UserValidator {
    @Override
    public void validate(User user) {
        if (!user.getEmail().contains("@")) throw new RuntimeException("Invalid email.");
        checkNext(user);
    }
}