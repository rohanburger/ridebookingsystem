package za.ac.cput.repository;

import za.ac.cput.domain.Session;

import java.util.ArrayList;
import java.util.List;
/*
    SessionRepostory.java
    Class for the Session repository
    Author:Rohan Janzen Burger
    Date:21/03/2025
*/

public class SessionRepository implements ISessionRepository {//Implements the Interface ISessionRepository

    private static ISessionRepository repository = null;//Creates a object of type ISessionRepository equals to null
    private List<Session> sessionList;//Create a list that holds type session , with the name sessionlist

    private SessionRepository() {//Default constructor for class
        sessionList = new ArrayList<Session>();
    }

    public static ISessionRepository getRepository() {//Methods of type IsessionRepostiry
        if (repository == null) {//Checks if repostory is equal to null
            repository = new SessionRepository();//If so a new instance of Sessionrepository is created
        }
        return repository;//If not it returns the existing repository
    }

    @Override
    public List<Session> getAll() {
        System.out.println(sessionList);
        return new ArrayList<>(sessionList);//returns arraylist containign all sessions in the sessionlist
    }

    @Override
    public boolean create(Session session) {
        System.out.println("Session created"+session);
       return sessionList.add(session);//Adds session object to sessionList
    }

    @Override
    public Session read(String sessionId) {
        for (Session session : sessionList) {//Loops through session list
            if (session.getSessionid().equals(sessionId)) {//Checks if any session ID equals to a session
                System.out.println("Session read"+session);
                return session;//returnse session that equal to sessionID
            }

        }
        return null;
    }

    @Override
    public boolean update(String sessionId,Session session) {
        for (Session sessionlist : sessionList) {//Loops through session list
            if (sessionlist.getSessionid().equals(sessionId)) {//Checks if any session ID equals to a session
                sessionList.remove(sessionlist);//Removes session that equals to sessionID
                sessionList.add(session);//Then adds that session back but the updated version
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String sessionId) {
        for (int i = 0; i < sessionList.size(); i++) {//Loops through sessionlist
            if (sessionList.get(i).getSessionid().equals(sessionId)) {//Check is the session ID equal to the session ID and index i
                sessionList.remove(i);//Removes the session object at I if equals to one another
                return true;
            }
        }
        return false;
    }
    public void clearSessions() {
        sessionList.clear();//Clears the arraylist
    }
}
