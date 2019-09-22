package ac.za.cput.Factory;

import ac.za.cput.Domain.Lecturer;

public class LecturerFactory {
    public static Lecturer getLecturer(String userID, String firstName, String lastName, String email) {
        return new Lecturer.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
    }
}


