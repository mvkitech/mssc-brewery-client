package guru.springframework.msscbreweryclient.web.client;

import java.net.URI;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import guru.springframework.msscbreweryclient.web.model.CustomerDto;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto dto = client.getBeerById(UUID.randomUUID());
        assertNotNull(dto);
    }

// FUBAR this test was broken when "Spring MVC Validation" were changes made to "mssc-brewery" project?    
//    @Test
//    void testSaveNewBeer() {
//        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
//        URI uri = client.saveNewBeer(beerDto);
//        assertNotNull(uri);
//    }

// FUBAR this test was broken when "Spring MVC Validation" were changes made to "mssc-brewery" project?    
//    @Test
//    void testUpdateBeer() {
//        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
//        client.updateBeer(UUID.randomUUID(), beerDto);
//    }

    @Test
    void testDeleteBeer() {
        client.deleteBeer(UUID.randomUUID());
    }

    @Test
    void getCustomerById() {
        CustomerDto dto = client.getCustomerById(UUID.randomUUID());
        assertNotNull(dto);
    }

    @Test
    void testSaveNewCustomer() {
        CustomerDto customerDto = CustomerDto.builder().name("Joe").build();
        URI uri = client.saveNewCustomer(customerDto);
        assertNotNull(uri);
    }

    @Test
    void testUpdateCustomer() {
        CustomerDto customerDto = CustomerDto.builder().name("Jim").build();
        client.updateCustomer(UUID.randomUUID(), customerDto);
    }

    @Test
    void testDeleteCustomer() {
        client.deleteCustomer(UUID.randomUUID());
    }
}