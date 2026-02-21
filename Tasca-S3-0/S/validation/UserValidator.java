package main.java.validation;

import main.java.user.User;

public abstract class UserValidator {
    protected UserValidator next;

    public void setNext(UserValidator next) {
        this.next = next;
    }

    public abstract void validate(User user);

    protected void checkNext(User user) {
        if (next != null) next.validate(user);
    }

}
