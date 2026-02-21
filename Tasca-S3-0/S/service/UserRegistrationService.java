package main.java.service;

import main.java.user.User;
import main.java.validation.UserValidator;

public class UserRegistrationService {

    private UserValidator validatorChain; //
    private ConfirmationService confirmationService;

    public UserRegistrationService(UserValidator validatorChain, ConfirmationService confirmationService) {
        this.validatorChain = validatorChain;
        this.confirmationService = confirmationService;
    }

    public void register(User user) {
        validatorChain.validate(user);

        if (!confirmationService.isConfirmed(user)) {
            System.out.println("The user did not confirm the registration.");
            return;
        }

        System.out.println("Successfully registered user!");
    }
}