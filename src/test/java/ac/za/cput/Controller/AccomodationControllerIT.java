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
import ac.za.cput.Domain.Accomodation;
import ac.za.cput.Factory.AccomodationFactory;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccomodationControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/accomodation";

    @Test
    public void a_create() {

        Accomodation accom = AccomodationFactory.getAccom(213145);
        ResponseEntity<Accomodation> postResponse = restTemplate.postForEntity(baseURL + "/new", accom, Accomodation.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        System.out.println(postResponse.getBody());

    }

    @Test
    public void b_findById() {

        Accomodation accom = restTemplate.getForObject(baseURL + "/find/" + 213145 , Accomodation.class);
        assertNotNull(accom);
        System.out.println(accom.getAccId());

    }

    @Test
    public void c_update() {

        Accomodation accom = restTemplate.getForObject(baseURL + "/find/" + "213180545", Accomodation.class);
        accom.setAccAmount();
        restTemplate.put(baseURL + "/update/" + "216183006", accom);
        Accomodation updateAccom = restTemplate.getForObject(baseURL + "/update/" + "213180545", Accomodation.class);
        assertNotNull(accom);
        System.out.println(accom);

    }

    @Test
    public void e_delete() {

        Accomodation accom = restTemplate.getForObject(baseURL + "/find/" + 213145 , Accomodation.class);
        assertNotNull(accom);
        restTemplate.delete(baseURL + "/delete/" + "213180545");

        try {
            accom = restTemplate.getForObject(baseURL + "/find/" + 213145, Accomodation.class);
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
