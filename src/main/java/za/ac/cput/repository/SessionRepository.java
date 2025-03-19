package za.ac.cput.repository;

import za.ac.cput.domain.Session;

import java.util.HashMap;
import java.util.Map;

public class SessionRepository {
    private final Map<String, Session> sessions = new HashMap<>();

    public void create(String sessionId, Session session){
        sessions.put(sessionId,session);
    }
    public Session read(String sessionId) {
        return sessions.get(sessionId);
    }

    // UPDATE: Updates an existing session
    public void update(String sessionId, Session newSession) {
        if (sessions.containsKey(sessionId)) {
            sessions.put(sessionId, newSession);
        }
    }

    // DELETE: Removes a session from the repository
    public void delete(String sessionId) {
        sessions.remove(sessionId);
    }
}
