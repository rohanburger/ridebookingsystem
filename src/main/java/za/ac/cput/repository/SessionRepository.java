package za.ac.cput.repository;

import za.ac.cput.domain.Session;

import java.util.ArrayList;
import java.util.List;

public class SessionRepository implements ISessionRepository {

    private static ISessionRepository repository = null;
    private List<Session> sessionList;

    private SessionRepository() {
        sessionList = new ArrayList<Session>();
    }

    public static ISessionRepository getRepository() {
        if (repository == null) {
            repository = new SessionRepository();
        }
        return repository;
    }

    @Override
    public List<Session> getAll() {
        return new ArrayList<>(sessionList);
    }

    @Override
    public boolean create(Session session) {
       return sessionList.add(session);
    }

    @Override
    public Session read(String sessionId) {
        for (Session session : sessionList) {
            if (session.getSessionid().equals(sessionId)) {
                return session;
            }

        }
        return null;
    }

    @Override
    public boolean update(String sessionId,Session session) {
        for (Session sessionlist : sessionList) {
            if (sessionlist.getSessionid().equals(sessionId)) {
                sessionList.remove(sessionlist);
                sessionList.add(session);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String sessionId) {
        return sessionList.remove(sessionId);

    }
}
