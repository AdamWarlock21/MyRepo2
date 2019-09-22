package ac.za.cput.Repository.Impl;




import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ac.za.cput.Domain.Lecturer;
import ac.za.cput.Factory.LecturerFactory;
import ac.za.cput.Repository.Impl.LecturerRepositoryImpl;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LecturerRepositoryTest {

    @Autowired
    private LecturerRepositoryImpl lecturerRepository;
    Lecturer lecturer = LecturerFactory.getLecturer("2131", "I", "Vardien", "213180545@my.com");

    @Test
    public void a_create() {

        lecturerRepository.create(lecturer);
        assertNotNull(lecturerRepository.getAll());
        System.out.println(lecturerRepository.getAll());

    }

    @Test
    public void b_read() {

        Lecturer fromSet = lecturerRepository.read(lecturer.getUserID());
        assertEquals(lecturer, fromSet);
        System.out.println(lecturerRepository.getAll());
    }

    @Test
    public void c_update() {


        Lecturer updatedLecturer  = LecturerFactory.getLecturer("35614", "A", "Abrahams", "3561438@my.com");
        lecturerRepository.update(updatedLecturer);
        Assert.assertNotEquals(lecturer.getFirstName(), updatedLecturer.getFirstName());
        System.out.println(lecturerRepository.getAll());



    }

    @Test
    public void d_delete() {

        assertNotNull(lecturerRepository.getAll());
        lecturerRepository.delete(lecturer.getUserID());
        Lecturer lecturerTor = lecturerRepository.read(lecturer.getUserID());
        assertNull(lecturerTor);
        System.out.println(lecturerRepository.getAll());

    }
}