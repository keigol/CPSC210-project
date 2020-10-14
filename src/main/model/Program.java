package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Represents a weight-training/fitness program
public class Program {
    private String name;
    private List<Session> sessions;

    // MODIFIES: this
    // EFFECTS: create a program object with empty list of sessions
    public Program(String name) {
        this.name = name;
        this.sessions = new ArrayList<>();
    }

    // REQUIRES: session is in sessions
    // MODIFIES: this
    // EFFECTS: adds session to sessions
    public void addSession(Session session) {
        sessions.add(session);
    }

    // REQUIRES: session is in sessions
    // MODIFIES: this
    // EFFECTS: removes session from sessions
    public void removeSession(Session session) {
        sessions.remove(session);
    }

    // REQUIRES: i is in range of sessions length
    // MODIFIES: this
    // EFFECTS: removes ith session from sessions
    public void removeSession(int i) {
        sessions.remove(i);
    }

    // EFFECTS: returns size of sessions;
    public int numberOfSessions() {
        return sessions.size();
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public Session getSession(int i) {
        return sessions.get(i);
    }

    // EFFECTS: returns an optional Session
    public Optional<Session> getSessionByName(String name) {
        Optional<Session> session = Optional.empty();
        for (Session s : sessions) {
            if (s.getName().equals(name)) {
                session = Optional.of(s);
            }
        }
        return session;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}