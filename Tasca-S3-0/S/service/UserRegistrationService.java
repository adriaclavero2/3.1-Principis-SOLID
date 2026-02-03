package service;

import interfaces.EmailRegistration;
import interfaces.PasswordRegistration;
import user.User;

public class UserRegistrationService {

    private EmailRegistration emailRegistration;
    private PasswordRegistration passwordRegistration;

    public UserRegistrationService(
            EmailRegistration emailRegistration,
            PasswordRegistration passwordRegistration) {

        this.emailRegistration = emailRegistration;
        this.passwordRegistration = passwordRegistration;
    }

    public void register(User user) {

        emailRegistration.registerEmail(user);
        passwordRegistration.registerPassword(user);

        boolean userConfirmed = simulateConfirmation();

        if (!userConfirmed) {
            System.out.println("User did not confirm registration...");
            return;
        }

        System.out.println("User registered successfully!");
    }

    private boolean simulateConfirmation() {
        System.out.println("Waiting for user confirmation...");
        return true;
    }
}