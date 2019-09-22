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
import ac.za.cput.Domain.Person;
import ac.za.cput.Factory.PersonFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/person";

    @Test
    public void a_create() {

        Person person = PersonFactory.getPerson("213180545", "Ismail", "Vardien", "213180545@mycput.ac.za");
        person.setUserID("213180545");
        ResponseEntity<Person> postResponse = restTemplate.postForEntity(baseURL + "/new", person, Person.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Person person = restTemplate.getForObject(baseURL + "/find/" + "216183006", Person.class);
        assertNotNull(person);
        System.out.println(person.getFirstName());

    }

    @Test
    public void c_update() {

        Person person = restTemplate.getForObject(baseURL + "/find/" + "213180545", Person.class);
        person.setFirstName("IV");
        restTemplate.put(baseURL + "/update/" + "213180545", person);
        Person updatedPerson = restTemplate.getForObject(baseURL + "/update/" + "213180545", Person.class);
        assertNotNull(person);
        System.out.println(person);

    }

    @Test
    public void e_delete() {

        Person person = restTemplate.getForObject(baseURL + "/find/" + "213180545", Person.class);
        assertNotNull(person);
        restTemplate.delete(baseURL + "/delete/" + "216183006");

        try {
            person = restTemplate.getForObject(baseURL + "/find/" + "216183006", Person.class);
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