package com.alberto.backend;

import com.alberto.backend.entities.Country;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class DemoApplicationTests {
    final String uri = "";

	@Test
	void contextLoads() {
    }
    
    @Test
    public void testCreateCountry(){
        // A ver
        // si sirve, viste?
        // Esta mierda la vamos a utilizar despues, mas adelante, vas a ver
        Country country = new Country();
        country.setName("Honduras");

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Country> postResponse = restTemplate.postForEntity(getRootUrl() + "/countries/add", country, Country.class);

    }

    public String getRootUrl() {
        return uri;
    }
}
