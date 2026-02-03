package main;

import implementations.ImplEmailRegistration;
import implementations.ImplPasswordRegistration;
import service.UserRegistrationService;
import user.User;

public class Main {
    public static void main(String[] args) {

        User juan = new User("Juanito", "juan@gmail.com", "aG878KJbju$");

        ImplEmailRegistration emailReg = new ImplEmailRegistration();
        ImplPasswordRegistration passReg = new ImplPasswordRegistration();

        UserRegistrationService service = new UserRegistrationService(emailReg, passReg);

        service.register(juan);

    }
}
