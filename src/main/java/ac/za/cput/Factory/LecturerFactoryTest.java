package ac.za.cput.Factory;

import org.junit.Assert;
import org.junit.Test;
import ac.za.cput.Domain.Lecturer;

public class LecturerFactoryTest {

    @Test
    public void getLecturer() {

        Lecturer lecturer = LecturerFactory.getLecturer( "216183006", "Deklerk", "Basson", "deklerk@dkbasson.com");
        Assert.assertNotNull(lecturer);
    }
}