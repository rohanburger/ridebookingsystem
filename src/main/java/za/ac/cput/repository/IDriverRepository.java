package za.ac.cput.repository;

import za.ac.cput.domain.Driver;
import java.util.List;
import java.util.Optional;

/*  IDriverRepository.java
    Driver Interface Repository class
    Author: Kyle Bowers
    Date: 25/03/2025
*/

public interface IDriverRepository {
    Driver save(Driver driver);
    Optional<Driver> findById(String id);
    List<Driver> findAll();
    boolean delete(String id);
}
