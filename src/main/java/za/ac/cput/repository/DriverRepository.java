package za.ac.cput.repository;

import za.ac.cput.domain.Driver;
import java.util.*;

/*
    DriverRepository.java
    Repository for managing Driver objects
    Author: Kyle Bowers
    Date: 22/03/2025
*/

public class DriverRepository implements IDriverRepository {
    private static DriverRepository repository = null;
    private Map<String, Driver> driverDB;

    private DriverRepository() {
        this.driverDB = Collections.synchronizedMap(new HashMap<>());
    }

    public static DriverRepository getInstance() {
        if (repository == null) {
            repository = new DriverRepository();
        }
        return repository;
    }

    @Override
    public Driver save(Driver driver) {
        driverDB.put(driver.getDriverId(), driver);
        return driver;
    }

    @Override
    public Optional<Driver> findById(String id) {
        return Optional.ofNullable(driverDB.get(id));
    }

    @Override
    public List<Driver> findAll() {
        return new ArrayList<>(driverDB.values());
    }

    @Override
    public boolean delete(String id) {
        return driverDB.remove(id) != null;
    }
}
