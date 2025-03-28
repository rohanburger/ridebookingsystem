package za.ac.cput.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Driver;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/*
    DriverRepositoryTest.java
    Unit tests for DriverRepository
    Author: Kyle Bowers
    Date: 22/03/2025
*/

class DriverRepositoryTest {
    private DriverRepository repository;
    private Driver driver1, driver2;

    @BeforeEach
    void setUp() {
        repository = DriverRepository.getInstance();
        repository.findAll().clear();

        driver1 = new Driver.Builder()
                .setDriverId("D001")
                .setDriverName("Kyle")
                .setDriverSurname("Bowers")
                .setDriverPhoneNum("0812708822")
                .setDriverEmail("kylebowers60@gmail.com")
                .setLicenseNum("Kb60001")
                .build();

        driver2 = new Driver.Builder()
                .setDriverId("D002")
                .setDriverName("Romano")
                .setDriverSurname("Christians")
                .setDriverPhoneNum("0727196078")
                .setDriverEmail("rdchristians@gmail.com")
                .setLicenseNum("RD467536")
                .build();
    }

    @Test
    void testSave() {
        Driver savedDriver = repository.save(driver1);
        assertNotNull(savedDriver);
        assertEquals(driver1.getDriverId(), savedDriver.getDriverId());
    }

    @Test
    void testFindById() {
        repository.save(driver1);
        Optional<Driver> foundDriver = repository.findById("D001");
        assertTrue(foundDriver.isPresent());
        assertEquals("Kyle", foundDriver.get().getDriverName());
    }

    @Test
    void testFindAll() {
        repository.save(driver1);
        repository.save(driver2);
        List<Driver> drivers = repository.findAll();
        assertEquals(2, drivers.size());
    }

    @Test
    void testDelete() {
        repository.save(driver1);
        boolean deleted = repository.delete("D001");
        assertTrue(deleted);
        assertFalse(repository.findById("D001").isPresent());
    }
}