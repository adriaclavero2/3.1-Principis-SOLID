package service;

import interfaces.PersonRegistration;
import model.Person;

public class ServicePerson {
    private PersonRegistration personRegistration;

    public ServicePerson(PersonRegistration personRegistration) {
        this.personRegistration = personRegistration;
    }

    public void savePerson(Person person){
        personRegistration.savePerson(person);
    }
}
