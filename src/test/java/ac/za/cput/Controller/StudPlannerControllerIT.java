package ac.za.cput.Controller;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import ac.za.cput.Domain.Student;
import ac.za.cput.Factory.StudentFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudPlannerControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/student";

    @Test
    public void a_create() {

        Student student = StudentFactory.getStudent("216183006", "Ismail", "Vardien", "213180545@mycput.ac.za");
        student.setUserID("216183006");
        ResponseEntity<Student> postResponse = restTemplate.postForEntity(baseURL + "/new", student, Student.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Student student = restTemplate.getForObject(baseURL + "/find/" + "213180545", Student.class);
        assertNotNull(student);
        System.out.println(student.getFirstName());

    }

    @Test
    public void c_update() {

        Student student = restTemplate.getForObject(baseURL + "/find/" + "213180545", Student.class);
        student.setFirstName("IV");
        restTemplate.put(baseURL + "/update/" + "216183006", student);
        Student updatedStudent = restTemplate.getForObject(baseURL + "/update/" + "213180545", Student.class);
        assertNotNull(student);
        System.out.println(student);

    }

    @Test
    public void e_delete() {

        Student student = restTemplate.getForObject(baseURL + "/find/" + "213180545", Student.class);
        assertNotNull(student);
        restTemplate.delete(baseURL + "/delete/" + "213180545");

        try {
            student = restTemplate.getForObject(baseURL + "/find/" + "213180545", Student.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

    }

    @Test
    public void d_getAll() {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());

    }


}
