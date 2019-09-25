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
import ac.za.cput.Domain.Administrator;
import ac.za.cput.Factory.AdministratorFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FundedAccControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/administrator";

    @Test
    public void a_create() {

        Administrator administrator = AdministratorFactory.getAdministrator("213180545", "Ismail", "Vardien", "213180545@mycput.ac.");
        administrator.setUserID("213180545");
        ResponseEntity<Administrator> postResponse = restTemplate.postForEntity(baseURL + "/new", administrator, Administrator.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Administrator administrator = restTemplate.getForObject(baseURL + "/find/" + "213180545", Administrator.class);
        assertNotNull(administrator);
        System.out.println(administrator.getFirstName());

    }

    @Test
    public void c_update() {

        Administrator administrator = restTemplate.getForObject(baseURL + "/find/" + "213180545", Administrator.class);
        administrator.setFirstName("Is");
        restTemplate.put(baseURL + "/update/" + "216183006", administrator);
        Administrator updatedAdministrator = restTemplate.getForObject(baseURL + "/update/" + "213180545", Administrator.class);
        assertNotNull(administrator);
        System.out.println(administrator);

    }

    @Test
    public void e_delete() {

        Administrator administrator = restTemplate.getForObject(baseURL + "/find/" + "213180545", Administrator.class);
        assertNotNull(administrator);
        restTemplate.delete(baseURL + "/delete/" + "213180545");

        try {
            administrator = restTemplate.getForObject(baseURL + "/find/" + "213180545", Administrator.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }

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
