package ac.za.cput.Factory;

import ac.za.cput.Domain.Administrator;

public class AdministratorFactory {
  public static Administrator getAdministrator(String userID, String firstName, String lastName, String email) {
      return new Administrator.Builder().userID(userID).firstName(firstName).lastName(lastName).email(email).build();
  }
}


