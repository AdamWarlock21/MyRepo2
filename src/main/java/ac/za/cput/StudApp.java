package ac.za.cput;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StudApp {


    public static void main(String[] args) {
        SpringApplication.run(StudApp.class, args);
    }
    
    
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

