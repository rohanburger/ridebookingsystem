package za.ac.cput.factory;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Location;
import static org.junit.jupiter.api.Assertions.*;

public class LocationFactoryTest {
    private Location location2;
    @BeforeEach
    void setUp() {
        location2 = new Location();
    }


    @Test
    void createLocation_success() {
        Location location=LocationFactory.createLocation("101","Cornwall","Woodstock","Cape Town","Gympie","Salt River","Cape Town");
        assertNotNull(location);
        assertEquals("101",location.getLocationId());
        assertEquals("Cornwall",location.getPickupStreet());
        assertEquals("Woodstock",location.getPickupSuburb());
        assertEquals("Cape Town",location.getPickupCity());
        assertEquals("Gympie",location.getDropoffStreet());
        assertEquals("Salt River",location.getDropoffSuburb());
        assertEquals("Cape Town",location.getDropoffCity());
    }

    @Test
    void createLocation_locationIdisNullorEmpty(){
        Location location=LocationFactory.createLocation("","Cornwall","Woodstock","Cape Town","Gympie","Salt River","Cape Town");
        assertNotNull(location);
        assertEquals("",location.getLocationId());
    }

    @Test
    void createLocation_pickUpStreetisNullorEmpty(){
        Location location=LocationFactory.createLocation("101","","Woodstock","Cape Town","Gympie","Salt River","Cape Town");
        assertNotNull(location);
        assertEquals("",location.getPickupStreet());
    }

    @Test
    void createLocation_pickUpSuburbisNullorEmpty(){
        Location location=LocationFactory.createLocation("101","Cornwall","","Cape Town","Gympie","Salt River","Cape Town");
        assertNotNull(location);
        assertEquals("",location.getPickupSuburb());
    }

    @Test
    void createLocation_pickUpCityNullorEmpty(){
        Location location=LocationFactory.createLocation("101","Cornwall","Woodstock","","Gympie","Salt River","Cape Town");
        assertNotNull(location);
        assertEquals("",location.getPickupCity());
    }

    @Test
    void createLocation_dropoffStreetisNullorEmpty(){
        Location location=LocationFactory.createLocation("101","Cornwall","Woodstock","Cape Town","","Salt River","Cape Town");
        assertNotNull(location);
        assertEquals("",location.getDropoffStreet());
    }

    @Test
    void createLocation_dropoffSuburbisNullorEmpty(){
        Location location=LocationFactory.createLocation("101","Cornwall","Woodstock","Cape Town","Gympie","","Cape Town");
        assertNotNull(location);
        assertEquals("",location.getDropoffSuburb());
    }

    @Test
    void createLocation_dropoffCityNullorEmpty(){
        Location location=LocationFactory.createLocation("101","Cornwall","Woodstock","Cape Town","Gympie","Salt River","");
        assertNotNull(location);
        assertEquals("",location.getDropoffCity());
    }

    @Test
    void createLocation_pickupAndDropoffNotEqual(){
        Location location=LocationFactory.createLocation("101","Cornwall","Woodstock","Cape Town","Cornwall","Woodstock","Cape Town");
        assertNotNull(location);
        assertNotEquals(location2.dropoffDetails(),location2.pickupDetails());

    }































}
