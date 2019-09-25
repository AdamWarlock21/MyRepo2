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
import ac.za.cput.Domain.BookPlan;
import ac.za.cput.Factory.BookPlanFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookPlanControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/administrator";

    @Test
    public void a_create() {

        BookPlan administrator = BookPlanFactory.getPlanner("IT", "Horror", 500);
        administrator.getBookGenre();
        ResponseEntity<BookPlan> postResponse = restTemplate.postForEntity(baseURL + "/new", administrator, BookPlan.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        BookPlan book = restTemplate.getForObject(baseURL + "/find/" + "IT", BookPlan.class);
        assertNotNull(book);
        System.out.println(book.getBookName());

    }

    @Test
    public void c_update() {

        BookPlan book = restTemplate.getForObject(baseURL + "/find/" + "IT", BookPlan.class);
        book.getBookName();
        restTemplate.put(baseURL + "/update/" + "Twilight", book);
        BookPlan  newBook = restTemplate.getForObject(baseURL + "/update/" + "Twilight", BookPlan.class);
        assertNotNull(book);
        System.out.println(book);

    }

    @Test
    public void e_delete() {

        BookPlan book = restTemplate.getForObject(baseURL + "/find/" + "IT", BookPlan.class);
        assertNotNull(book);
        restTemplate.delete(baseURL + "/delete/" + "IT");

        
    }

    @Test
    public void d_getAll() {

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.withBasicAuth("admin", "admin").exchange(baseURL + "/getall", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());

    }


}