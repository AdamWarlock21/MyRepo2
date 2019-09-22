package ac.za.cput.Factory;

import ac.za.cput.Domain.Person;

public class PersonFactory {
    public static Person getPerson(String userID, String firstName, String lastName, String email) {
        return new Person.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


