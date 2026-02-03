package main;

import implementations.MySql;
import model.Person;
import service.ServicePerson;

public class Main {
    public static void main(String[] args) {

        ServicePerson service = new ServicePerson(new MySql());

        Person juan = new Person();
        juan.setName("Juan");

        service.savePerson(juan);
    }
}
