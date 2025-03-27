package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.*;
import za.ac.cput.factory.SessionFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/*
    SessionRepostoryTest.java
    Test class for Session repository
    Author:Rohan Janzen Burger
    Date:27/03/2025
*/
class SessionRepositoryTest {
    private SessionRepository repository;
    private Session session1, session2;
    private Passenger passenger;
    private Driver driver;
    private Location location;

    @BeforeEach
    void setUp() {
        repository = (SessionRepository) SessionRepository.getRepository();//Calls methods that ensures only one instance of sessionrepository
        repository.clearSessions();//Calls the clear method in the SessionRepository class

        passenger = new Passenger();//Creates instance of passsenger
        driver = new Driver();//Creates instance of Driver
        location = new Location();//Creates instance of Location

        session1 = SessionFactory.createSession("S001", passenger, driver, location, 2, 150.0f, "Pending");//Creates two sessions
        session2 = SessionFactory.createSession("S002", passenger, driver, location, 3, 200.0f, "Expired");
        repository.create(session1);//adds created sessions to repository
        repository.create(session2);
    }

    @Test
    void testCreate() {
        Session session3 = SessionFactory.createSession("S003", passenger, driver, location, 4, 250.0f, "Pending");//Creates a new session
        assertTrue(repository.create(session3));//Calls the create methods and adds Session to repo and checks if added was a succcess
        assertEquals(3, repository.getAll().size());//Assert that repo has 3 sessions
    }
    @Test
    void testRead() {
        Session foundSession = repository.read("S001");//Calls read methods , looking for session that has sessionID S001
        assertNotNull(foundSession);//Assert that session was found
        assertEquals("S001", foundSession.getSessionid());//Assert that S001 matches the sessionID of found session
    }
    @Test
    void testUpdate() {
        Session updatedSession = SessionFactory.createSession("S001", passenger, driver, location, 5, 175.0f, "Active");//Creates updated session of sesesion 1
        boolean updated = repository.update("S001", updatedSession);//Updates session that matches the sessionID
        assertTrue(updated);//Assets that the method has updated
        assertEquals("Active", repository.read("S001").getSessionStatus());//Asserts that the sessionStatus is know updates
    }

    @Test
    void testDelete() {
        boolean deleted = repository.delete("S002");//calls methods that deletes object with the value S002
        assertTrue(deleted);//Assets that the session has been deleted
        assertNull(repository.read("S002"));//Asserts tha the session with sessionID S002 is null
        assertEquals(1, repository.getAll().size());//Asserts that only one object exists in repostiroy
    }

    @Test
    void testGetAll() {
        List<Session> sessions = repository.getAll(); //retrieves all session from repo
        assertEquals(2, sessions.size());//Assert that only 2 sessions exist
    }

}