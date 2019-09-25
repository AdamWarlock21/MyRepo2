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
import ac.za.cput.Domain.ExamPlanner;
import ac.za.cput.Factory.ExamPlanFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExamPlannerControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/administrator";

    @Test
    public void a_create() {

        ExamPlanner administrator = ExamPlanFactory.getPlanner("ADP", "ADP356S", "13:00");
        administrator.getExamName();
        ResponseEntity<ExamPlanner> postResponse = restTemplate.postForEntity(baseURL + "/new", administrator, ExamPlanner.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        ExamPlanner book = restTemplate.getForObject(baseURL + "/find/" + "ADP", ExamPlanner.class);
        assertNotNull(book);
        System.out.println(book.getExamName());

    }

    @Test
    public void c_update() {

        ExamPlanner book = restTemplate.getForObject(baseURL + "/find/" + "ADP", ExamPlanner.class);
        book.getExamName();
        restTemplate.put(baseURL + "/update/" + "ITS", book);
        ExamPlanner  newBook = restTemplate.getForObject(baseURL + "/update/" + "ITS", ExamPlanner.class);
        assertNotNull(book);
        System.out.println(book);

    }

    @Test
    public void e_delete() {

        ExamPlanner book = restTemplate.getForObject(baseURL + "/find/" + "ADP", ExamPlanner.class);
        assertNotNull(book);
        restTemplate.delete(baseURL + "/delete/" + "ADP");

        
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