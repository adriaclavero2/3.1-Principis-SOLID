package implementations;

import interfaces.PersonRegistration;
import model.Person;

public class MySql implements PersonRegistration {
    @Override
    public void savePerson(Person person) {
        System.out.println("Saving person in MySQL database: " + person.getName());
    }
}
