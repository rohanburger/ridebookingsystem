package za.ac.cput.repository;

import za.ac.cput.domain.Session;

import java.util.List;

public interface ISessionRepository extends IRepository<Session, String> {
    List<Session> getAll();
}
