package main.java.main;

import main.java.service.ConfirmationService;
import main.java.service.UserRegistrationService;
import main.java.user.User;
import main.java.validation.EmailValidator;
import main.java.validation.PasswordValidator;

public class Main {
    public static void main(String[] args) {
        User usuarioValido = new User("Pepito", "pepito@correo.com", "Password123!");

        EmailValidator emailVal = new EmailValidator();
        PasswordValidator passVal = new PasswordValidator();

        emailVal.setNext(passVal);

        ConfirmationService confService = new ConfirmationService();

        UserRegistrationService service = new UserRegistrationService(emailVal, confService);

        System.out.println("-Starting registration.......");

        try {
            service.register(usuarioValido);
        } catch (Exception e) {
            System.err.println("Error de validación: " + e.getMessage());
        }
    }
}