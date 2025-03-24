package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.*;

class SessionFactoryTest {

    private Passenger passenger;
    private Driver driver;
    private Location location;

    @BeforeEach
    void setUp() {
        passenger = new Passenger();  // You need to define how Passenger is created
        driver = new Driver();        // Define the Driver class properly
        location = new Location();    // Define the Location class properly
    }

    @Test
    void testCreateSession_Success() {

    }


}