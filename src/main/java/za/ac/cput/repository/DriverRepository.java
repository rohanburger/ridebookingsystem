package za.ac.cput.repository;

import za.ac.cput.domain.Driver;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
    DriverRepository.java
    Repository for managing Driver objects
    Author: Kyle Bowers
    Date: 22/03/2025
*/

public class DriverRepository {
    private static DriverRepository repository = null;
    private Map<String, Driver> driverDB;

    private DriverRepository() {
        this.driverDB = new HashMap<>();
    }

    public static DriverRepository getInstance() {
        if (repository == null) {
            repository = new DriverRepository();
        }
        return repository;
    }

    public Driver save(Driver driver) {
        driverDB.put(driver.getDriverId(), driver);
        return driver;
    }

    public Optional<Driver> findById(String driverId) {
        return Optional.ofNullable(driverDB.get(driverId));
    }

    public boolean delete(String driverId) {
        if (driverDB.containsKey(driverId)) {
            driverDB.remove(driverId);
            return true;
        }
        return false;
    }

    public Map<String, Driver> findAll() {
        return driverDB;
    }
}
