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
        passenger = new Passenger();
        driver = new Driver();
        location = new Location();
    }

    @Test
    void createSession_Success() {
        Session session = SessionFactory.createSession("123", passenger, driver, location, "2", 150.0f, "Active");
        //Creates and object of session and calls factory method(createSession) and populates

        assertNotNull(session);//Checks if session object returend is correct
        assertEquals("123", session.getSessionid());//checks *if sessionid* is set correctly
        assertEquals("2", session.getPassengerCount());//* if passangerCount*
        assertEquals(150.0f, session.getSessionAmount());//* if sessionAmount*
        assertEquals("Active", session.getSessionStatus());//*if sessionStatus*
    }

    @Test
    void createSession_InvalidPassengerCount() {
        Session session = SessionFactory.createSession("123", passenger, driver, location, "1", 150.0f, "Active");
        assertNotNull(session);//Checks if session object returend is correct
        assertEquals("1", session.getPassengerCount());//Check if passenger coutn equals empty
    }

    @Test
    void createSession_InvalidSessionStatus() {
        Session session = SessionFactory.createSession("123", passenger, driver, location, "2", 150.0f, "On the road");
        assertNotNull(session);
        assertEquals("On the road", session.getSessionStatus());//
    }

    @Test
    void createSession_TooLowSessionAmount() {
        Session session = SessionFactory.createSession("123", passenger, driver, location, "2", 10.0f, "Active");
        assertNotNull(session);
        assertEquals(10.0f, session.getSessionAmount());
    }

}