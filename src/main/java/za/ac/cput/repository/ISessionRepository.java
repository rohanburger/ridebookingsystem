package za.ac.cput.repository;

import za.ac.cput.domain.Session;

import java.util.List;
/*
    ISessionRepostory.java
    Interface for the Session repository
    Author:Rohan Janzen Burger
    Date:21/03/2025
*/

public interface ISessionRepository extends IRepository<Session, String> {//Extends the genral Interface repsitory class
    List<Session> getAll();//Gets all session object in repo
}
