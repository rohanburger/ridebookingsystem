package za.ac.cput.factory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import za.ac.cput.domain.*;
/*
    SessionRepostoryTest.java
    Test class for Session factory
    Author:Rohan Janzen Burger
    Date:26/03/2025
*/
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
        Session session = SessionFactory.createSession("123", passenger, driver, location, 2, 150.0f, "Active");
        //Creates and object of session and calls factory method(createSession) and populates

        assertNotNull(session);//Checks if session object returend is correct
        assertEquals("123", session.getSessionid());//checks *if sessionid* is set correctly
        assertEquals(2, session.getPassengerCount());//* if passangerCount*
        assertEquals(150.0f, session.getSessionAmount());//* if sessionAmount*
        assertEquals("Active", session.getSessionStatus());//*if sessionStatus*
    }
    @Test
    void createSession_SessionIdNullOrEmpty() {
        Session session = SessionFactory.createSession("", passenger, driver, location, 2, 150.0f, "Active");
        assertNotNull(session);
        assertEquals("", session.getSessionid());
    }

    @Test
    void createSession_PassengerCountIsZero() {
        Session session = SessionFactory.createSession("123", passenger, driver, location, 0, 150.0f, "Active");
        assertNotNull(session);
        assertEquals(0, session.getPassengerCount());
    }

    @Test
    void createSession_SessionStatusNullOrEmpty() {
        Session session = SessionFactory.createSession("123", passenger, driver, location, 2, 150.0f, "");
        assertNotNull(session);
        assertEquals("", session.getSessionStatus());
    }

    @Test
    void createSession_InvalidSessionStatus() {
        Session session = SessionFactory.createSession("123", passenger, driver, location, 2, 150.0f, "On The Road again");
        assertNotNull(session);
        assertEquals("On The Road again", session.getSessionStatus());
    }

    @Test
    void createSession_TooLowSessionAmount() {
        Session session = SessionFactory.createSession("123", passenger, driver, location, 2, 0.0f, "Active");
        assertNotNull(session);
        assertEquals(0.0f, session.getSessionAmount());
    }

}