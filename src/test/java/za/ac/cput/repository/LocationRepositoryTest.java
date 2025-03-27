package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Location;
import za.ac.cput.factory.LocationFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class LocationRepositoryTest {
    private LocationRepository repository;
    private Location location1, location2;

    @BeforeEach
    void setUp() {
        repository=(LocationRepository) LocationRepository.getRepository();
        repository.clearLocation();

        location1= LocationFactory.createLocation("101","Cornwall","Woodstock","Cape Town","Gympie","Salt River","Cape Town");
        location2= LocationFactory.createLocation("102","Cornwall","Woodstock","Cape Town","Gympie","Salt River","Cape Town");
        repository.create(location1);
        repository.create(location2);
    }

    @Test
    void testCreate(){
        Location location3=LocationFactory.createLocation("103","Cornwall","Woodstock","Cape Town","Gympie","Salt River","Cape Town");
        assertTrue(repository.create(location3));
        assertEquals(3, repository.getAll().size());
    }

    @Test
    void testRead(){
        Location findLocation=repository.read("101");
        assertNotNull(findLocation);
        assertEquals("101",findLocation.getLocationId());
    }

    @Test
    void testUpdate(){
        Location updateLocation=LocationFactory.createLocation("101","Cornwall","Observatory","Cape Town","Gympie","Salt River","Cape Town");
        boolean update=repository.update("101",updateLocation);
        assertTrue(update);
        assertEquals("Observatory",updateLocation.getPickupSuburb());
    }

    @Test
    void testDelete(){
        boolean delete=repository.delete("102");
        assertTrue(delete);
        assertNull(repository.read("102"));
        assertEquals(1,repository.getAll().size());
    }

    @Test
    void testgetAll(){
        List<Location> locationList=repository.getAll();
        assertEquals(2, locationList.size());
    }



}


