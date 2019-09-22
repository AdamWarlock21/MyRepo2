package ac.za.cput.Factory;

import ac.za.cput.Domain.Student;

public class StudentFactory {
    public static Student getStudent(String userID, String firstName, String lastName, String email) {
        return new Student.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


